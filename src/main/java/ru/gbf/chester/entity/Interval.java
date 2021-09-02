package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Table("intervals")
@Data
@AllArgsConstructor
public class Interval {
    @Id
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long groomerId;
    private Long procedureId;


    public static List<Interval> getFree(List<Interval> busy, String date) {
        List<Interval> free = fillFree(date);
        for (Interval interval : busy) {
            if (interval.getEndTime().getHour() - interval.getStartTime().getHour() == 1) {
                Interval i1 = new Interval(0L, interval.getStartTime(), interval.getStartTime().plusMinutes(30), 0L, 0L);
                Interval i2 = new Interval(0L, interval.getStartTime().plusMinutes(30), interval.getEndTime(), 0L, 0L);
                free.remove(i1);
                free.remove(i2);
            } else {
                free.remove(interval);
            }
        }
        return free;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Interval interval = (Interval) o;
        return Objects.equals(startTime, interval.startTime) && Objects.equals(endTime, interval.endTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startTime, endTime);
    }

    public static List<Interval> fillFree(String date) {
        List<Interval> free = new ArrayList<>();
        String[] strings = date.split("-");
        LocalDateTime dateTime = LocalDateTime.of(LocalDate.of(Integer.parseInt(strings[2]), Integer.parseInt(strings[1]), Integer.parseInt(strings[0])), LocalTime.of(10, 0));
        for (int i = 0; i < 24; i++) {
            free.add(new Interval (0L, dateTime, dateTime.plusMinutes(30), 0L, 0L));
            dateTime = dateTime.plusMinutes(30);
        }
        /*dateTime = LocalDateTime.of(LocalDate.of(Integer.parseInt(strings[2]), Integer.parseInt(strings[1]), Integer.parseInt(strings[0])), LocalTime.of(10, 0) );
        for (int i = 0; i < 12; i++) {
            free.add(new Interval(0L, dateTime, dateTime.plusHours(1), 0L, 0L));
            dateTime = dateTime.plusHours(1);
        }*/

        return free;
    }
}
