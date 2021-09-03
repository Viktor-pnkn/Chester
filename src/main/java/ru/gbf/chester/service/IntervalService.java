package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.IntervalRepository;
import ru.gbf.chester.entity.Interval;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class IntervalService {
    private final IntervalRepository intervalRepository;

    public Interval save(Interval interval) {
        return intervalRepository.save(interval);
    }

    public List<Interval> getProcedureIntervals(Long procedureId) {
        return intervalRepository.getProcedureIntervals(procedureId);
    }

    public List<Interval> getGroomerIntervals(Long groomerId) {
        return intervalRepository.getGroomerIntervals(groomerId);
    }

    public List<Interval> getGroomerFreeIntervalsByDate(Long groomerId, LocalDate date) {
        List<Interval> busy = intervalRepository.getGroomerFreeIntervalsByDate(groomerId, date);
        return getFree(busy, date);
    }

    public static List<Interval> getFree(List<Interval> busy, LocalDate date) {
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

    public static List<Interval> fillFree(LocalDate date) {
        LocalDateTime dateTime = LocalDateTime.of(date, LocalTime.of(10, 0));
        List<Interval> free = new ArrayList<>();
        for (int i = 0; i < 24; i++) {
            free.add(new Interval (0L, dateTime, dateTime.plusMinutes(30), 0L, 0L));
            dateTime = dateTime.plusMinutes(30);
        }

        return free;
    }

    public void deleteById(Long id) {
        intervalRepository.deleteById(id);
    }

}
