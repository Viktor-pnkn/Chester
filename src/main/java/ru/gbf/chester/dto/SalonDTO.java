package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SalonDTO {
    private Long id;
    private String address;
    private String phone;
}
