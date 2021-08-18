package ru.gbf.chester.mapper;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.entity.Interval;

@Component
public class IntervalMapper {
    public Interval toEntity(IntervalDTO intervalDTO) {
        return new Interval(
                intervalDTO.getId(),
                intervalDTO.getStart_time(),
                intervalDTO.getEnd_time(),
                intervalDTO.getGroomer_id()
        );
    }

    public IntervalDTO toDTO(Interval interval) {
        return new IntervalDTO(
                interval.getId(),
                interval.getStart_time(),
                interval.getEnd_time(),
                interval.getGroomer_id()
        );
    }
}
