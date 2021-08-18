package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@Table("users")
public class User {
    @Id
    private Long id;
    private String type;
    private String name;
    private String email;
    private String phone;

    private Long salon_id;
}
