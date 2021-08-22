package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Procedure;

import java.util.List;

public interface ProcedureRepository extends PagingAndSortingRepository<Procedure, Long> {
}
