package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.entity.User;

import java.util.List;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

    @Query("select p.id, p.name, p.breed, p.age, p.category, p.owner_id " +
    "from pets p where p.owner_id = :owner_id")
    List<Pet> getPets(Long owner_id);

    @Query("select i.start_time, i.end_time from intervals i where i.groomer_id = :groomer_id")
    List<Interval> getIntervals(Long groomer_id);
}
