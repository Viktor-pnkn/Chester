package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.SalonDTO;
import ru.gbf.chester.entity.Salon;

@Component
public class SalonMapper {
    public Salon toEntity(SalonDTO salonDTO) {
        return new Salon(
                salonDTO.getId(),
                salonDTO.getAddress(),
                salonDTO.getPhone()
        );
    }

    public SalonDTO toDTO(Salon salon) {
        return new SalonDTO(
                salon.getId(),
                salon.getAddress(),
                salon.getPhone()
        );
    }
}
