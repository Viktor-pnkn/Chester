package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.service.IntervalService;

@RestController
@RequestMapping("/interval")
@AllArgsConstructor
public class IntervalController {
    private final IntervalService intervalService;
    private final IntervalMapper intervalMapper;

    @PostMapping
    public IntervalDTO create(@RequestBody Interval interval) {
        return intervalMapper.toDTO(intervalService.save(interval));
    }
}
