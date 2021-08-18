package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class PetDTO {
    private Long id;
    private String name;
    private String breed;
    private Double age;
    private Long category;
    private Long owner_id;
}
