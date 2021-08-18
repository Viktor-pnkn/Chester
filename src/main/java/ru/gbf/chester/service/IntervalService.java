package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.IntervalRepository;
import ru.gbf.chester.entity.Interval;

@Service
@AllArgsConstructor
public class IntervalService {
    private final IntervalRepository intervalRepository;

    public Interval save(Interval interval) {
        return intervalRepository.save(interval);
    }
}
