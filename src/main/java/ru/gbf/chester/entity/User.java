package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.MappedCollection;
import org.springframework.data.relational.core.mapping.Table;

import java.util.List;
import java.util.Set;

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

    private Long salonId;

    @MappedCollection(idColumn = "owner_id")
    private final Set<Pet> pets;
}
