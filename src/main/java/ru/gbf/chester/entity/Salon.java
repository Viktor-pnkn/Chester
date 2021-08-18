package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("salons")
@AllArgsConstructor
@Data
public class Salon {
    @Id
    private Long id;
    private String address;
    private String phone;
}
