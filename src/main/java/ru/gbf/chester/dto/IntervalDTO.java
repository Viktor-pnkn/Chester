package ru.gbf.chester.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class IntervalDTO {
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long groomerId;
    private Long procedureId;
}
