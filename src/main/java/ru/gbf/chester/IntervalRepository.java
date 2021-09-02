package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Interval;

import java.time.LocalDateTime;
import java.util.List;

public interface IntervalRepository extends PagingAndSortingRepository<Interval, Long> {
    @Query("select i.id, i.start_time, i.end_time, i.groomer_id, " +
            "i.procedure_id from intervals i where i.procedure_id = :procedureId")
    List<Interval> getProcedureIntervals(Long procedureId);

    @Query("select i.id, i.start_time, i.end_time, i.groomer_id, " +
            "i.procedure_id from intervals i where i.groomer_id = :groomerId")
    List<Interval> getGroomerIntervals(Long groomerId);

    @Query("select i.id, i.start_time, i.end_time, i.groomer_id, " +
            "i.procedure_id from intervals i " +
            "where i.groomer_id = :groomerId and to_char(i.start_time, 'DD-MM-YYYY') = :date")
    List<Interval> getGroomerFreeIntervalsByDate(Long groomerId, String date);
}
