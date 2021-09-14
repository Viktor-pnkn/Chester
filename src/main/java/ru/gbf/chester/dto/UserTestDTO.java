package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import ru.gbf.chester.entity.Pet;

import java.util.Set;

@Data
@AllArgsConstructor
public class UserTestDTO {
    private Long id;
    private String type;
    private String name;
    private String email;
    private String phone;
    private Long salonId;
    private Set<Pet> pets;
}
