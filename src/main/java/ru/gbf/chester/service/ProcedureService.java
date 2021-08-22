package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gbf.chester.ProcedureRepository;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Procedure;
import ru.gbf.chester.mapper.IntervalMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ProcedureService {
    private final ProcedureRepository procedureRepository;
    private final IntervalService intervalService;
    private final IntervalMapper intervalMapper;

    public Procedure create(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    public List<IntervalDTO> getIntervals( Long id) {
        return intervalService.getProcedureIntervals(id).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }

}
