package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("procedures")
@AllArgsConstructor
@Data
public class Procedure {
    @Id
    private Long id;
    private String name;
    private Integer price;
}
