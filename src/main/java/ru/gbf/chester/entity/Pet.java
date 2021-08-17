package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@Table("pet")
public class Pet {
    @Id
    private Long id;
    private String name;
    private String breed;
    private Double age;
    private Long category;

    @Column("create_owner_id")
    private Long ownerId;
    private LocalDateTime createDt;
}
