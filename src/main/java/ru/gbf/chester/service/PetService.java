package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.PetRepository;
import ru.gbf.chester.entity.Pet;

import java.util.List;
import java.util.Optional;

/**
 * Бизнес-логика. Никакой работы с БД!!! То есть никаких SQL скриптов.
 * Сервис это то - КАК используем репозиторий.
 */

@Service
@AllArgsConstructor
public class PetService {
    private final PetRepository petRepository; // инжектим репозиторий

    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }

    public List<Pet> getAll() {
        return (List<Pet>) petRepository.findAll();
    }

    public Pet getById(Long id) {
        //return petRepository.findById(id).orElse(null);

        return petRepository.findById(id).orElseThrow(
                ()-> new RuntimeException("Tакого питомца нет")
        );
    }

    public List<Pet> getWhereAgeIsHigher(double age) {
        return petRepository.getWhereAgeIsHigher(age);
    }

    public List<Pet> getCategory(Long category) {
        return petRepository.findAllByCategoryEquals(category);
    }
}
