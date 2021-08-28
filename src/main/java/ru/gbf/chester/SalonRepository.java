package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Salon;
import ru.gbf.chester.entity.User;

import java.util.List;

public interface SalonRepository extends PagingAndSortingRepository<Salon, Long> {
}
