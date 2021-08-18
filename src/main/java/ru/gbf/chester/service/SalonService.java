package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.SalonRepository;
import ru.gbf.chester.entity.Salon;
import ru.gbf.chester.entity.User;

import java.util.List;

@AllArgsConstructor
@Service
public class SalonService {
    private final SalonRepository salonRepository;

    public Salon create(Salon salon) {
        return salonRepository.save(salon);
    }

    public List<User> getGroomers(Long salon_id) {
        return salonRepository.getGroomers(salon_id);
    }
}
