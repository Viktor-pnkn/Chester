package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import ru.gbf.chester.entity.Pet;

import java.util.List;

/**
 * В данном интерфейсе будет происходить вся работа с БД
 */
public interface PetRepository extends PagingAndSortingRepository<Pet,Long> {

    @Query("select p.id, p.name, p.breed, p.age, p.category, p.create_owner_id, " +
            "p.create_dt from pet p where p.age > :age")
    List<Pet> getWhereAgeIsHigher(double age);

    List<Pet> findAllByCategoryEquals(Long category);

    @Query("select p.id, p.name, p.breed, p.age, p.category, p.owner_id " +
            "from pets p where p.owner_id = :ownerId")
    List<Pet> getPets(Long ownerId);
}
