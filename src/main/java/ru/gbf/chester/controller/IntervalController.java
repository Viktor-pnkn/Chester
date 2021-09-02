package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.service.IntervalService;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/interval")
@AllArgsConstructor
public class IntervalController {
    private final IntervalService intervalService;
    private final IntervalMapper intervalMapper;

    @PostMapping
    public IntervalDTO create(@RequestBody IntervalDTO interval) {
        return intervalMapper.toDTO(intervalService.save(intervalMapper.toEntity(interval)));
    }

    @GetMapping("/getGroomerIntervals")
    public List<IntervalDTO> getGroomerIntervals(@RequestParam("id") Long id) {
        return intervalService.getGroomerIntervals(id).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/getGroomerFreeIntervalsByDate")
    public List<IntervalDTO> getGroomerFreeIntervalsByDate(@RequestParam("id") Long id,
                                                           @RequestParam("date") String date) {
        return intervalService.getGroomerFreeIntervalsByDate(id, date).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        intervalService.deleteById(id);
    }
}
