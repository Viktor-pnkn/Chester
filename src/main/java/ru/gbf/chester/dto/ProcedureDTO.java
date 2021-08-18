package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class ProcedureDTO {
    private Long id;
    private String name;
    private Integer price;
}
