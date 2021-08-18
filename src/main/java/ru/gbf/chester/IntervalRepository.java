package ru.gbf.chester;

import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Interval;

public interface IntervalRepository extends PagingAndSortingRepository<Interval, Long> {
}
