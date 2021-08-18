package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Salon;
import ru.gbf.chester.entity.User;

import java.util.List;

public interface SalonRepository extends PagingAndSortingRepository<Salon, Long> {

    @Query("select u.id, u.type, u.name, u.email, u.phone, u.salon_id from users u " +
    "where u.salon_id = :salon_id")
    List<User> getGroomers(Long salon_id);
}
