package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PetTestDTO {
    private Long id;
    private String name;
    private String breed;
    private Double age;
    private Long category;
    private Long ownerId;
}
