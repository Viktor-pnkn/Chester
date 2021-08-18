package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.dto.ProcedureDTO;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.mapper.ProcedureMapper;
import ru.gbf.chester.service.ProcedureService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/procedure")
@AllArgsConstructor
public class ProcedureController {
    private final ProcedureService procedureService;
    private final ProcedureMapper procedureMapper;
    private final IntervalMapper intervalMapper;


    @PostMapping
    public ProcedureDTO create(@RequestBody ProcedureDTO procedureDTO) {
        return procedureMapper.toDTO(procedureService.create(procedureMapper.toEntity(procedureDTO)));
    }

    @GetMapping("/getIntervals")
    public List<IntervalDTO> getIntervals(@RequestParam("id") Long id) {
        return procedureService.getIntervals(id).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }
}
