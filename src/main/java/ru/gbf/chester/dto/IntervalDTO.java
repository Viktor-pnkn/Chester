package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class IntervalDTO {
    private Long id;
    private LocalDateTime start_time;
    private LocalDateTime end_time;
    private Long groomer_id;
}
