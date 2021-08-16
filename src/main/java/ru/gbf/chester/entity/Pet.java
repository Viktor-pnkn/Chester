package ru.gbf.chester.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("pet")
public class Pet {
    @Id
    private Long id;
    private String name;
    private String breed;
    private Double age;
    private Long category;
}
