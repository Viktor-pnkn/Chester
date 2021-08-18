package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.ProcedureDTO;
import ru.gbf.chester.entity.Procedure;

@Component
public class ProcedureMapper {
    public Procedure toEntity(ProcedureDTO procedureDTO) {
        return new Procedure(
                procedureDTO.getId(),
                procedureDTO.getName(),
                procedureDTO.getPrice()
        );
    }

    public ProcedureDTO toDTO(Procedure procedure) {
        return new ProcedureDTO(
                procedure.getId(),
                procedure.getName(),
                procedure.getPrice()
        );
    }
}
