package ru.gbf.chester.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Table("intervals")
@Data
@AllArgsConstructor
public class Interval {
    @Id
    private Long id;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Long groomerId;
    private Long procedureId;
}
