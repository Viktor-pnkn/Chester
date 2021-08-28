package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.entity.Pet;

@Component
public class PetMapper {
    public Pet toEntity(PetDTO petDTO) {
        return new Pet(
                petDTO.getId(),
                petDTO.getName(),
                petDTO.getBreed(),
                petDTO.getAge(),
                petDTO.getCategory(),
                petDTO.getOwnerId()
        );
    }

    public PetDTO toDTO(Pet pet) {
        return new PetDTO(
                pet.getId(),
                pet.getName(),
                pet.getBreed(),
                pet.getAge(),
                pet.getCategory(),
                pet.getOwnerId()
        );
    }
}
