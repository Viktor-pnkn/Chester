package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.ProcedureRepository;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Procedure;

import java.util.List;

@Service
@AllArgsConstructor
public class ProcedureService {
    private final ProcedureRepository procedureRepository;

    public Procedure create(Procedure procedure) {
        return procedureRepository.save(procedure);
    }

    public List<Interval> getIntervals(Long procedure_id) {
        return procedureRepository.getIntervals(procedure_id);
    }

}
