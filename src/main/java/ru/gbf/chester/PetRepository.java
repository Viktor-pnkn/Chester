package ru.gbf.chester;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import ru.gbf.chester.entity.Pet;

import java.util.List;

/**
 * В данном интерфейсе будет происходить вся работа с БД
 */
public interface PetRepository extends CrudRepository<Pet,Long> {

    @Query("select p.id, p.name, p.breed, p.age, p.category, p.create_owner_id, " +
            "p.create_dt from pet p where p.age > :age")
    List<Pet> getWhereAgeIsHigher(double age);

    List<Pet> findAllByCategoryEquals(Long category);
}
