package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.IntervalRepository;
import ru.gbf.chester.entity.Interval;

import java.util.List;

@Service
@AllArgsConstructor
public class IntervalService {
    private final IntervalRepository intervalRepository;

    public Interval save(Interval interval) {
        return intervalRepository.save(interval);
    }

    public List<Interval> getProcedureIntervals(Long procedure_id) {
        return intervalRepository.getProcedureIntervals(procedure_id);
    }

    public List<Interval> getGroomerIntervals(Long groomer_id) {
        return intervalRepository.getGroomerIntervals(groomer_id);
    }
}
