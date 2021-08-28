package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.entity.Interval;

@Component
public class IntervalMapper {
    public Interval toEntity(IntervalDTO intervalDTO) {
        return new Interval(
                intervalDTO.getId(),
                intervalDTO.getStartTime(),
                intervalDTO.getEndTime(),
                intervalDTO.getGroomerId(),
                intervalDTO.getProcedureId()
        );
    }

    public IntervalDTO toDTO(Interval interval) {
        return new IntervalDTO(
                interval.getId(),
                interval.getStartTime(),
                interval.getEndTime(),
                interval.getGroomerId(),
                interval.getProcedureId()
        );
    }
}
