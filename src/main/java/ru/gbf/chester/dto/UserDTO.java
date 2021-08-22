package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserDTO {
    private Long id;
    private String type;
    private String name;
    private String email;
    private String phone;
    private Long salonId;
}
