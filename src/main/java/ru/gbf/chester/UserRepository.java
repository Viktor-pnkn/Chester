package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.entity.User;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query("select u.id, u.type, u.name, u.email, u.phone, u.salon_id from users u " +
            "where u.type = 'G' and u.salon_id = :salonId")
    List<User> getGroomers(Long salonId);
}
