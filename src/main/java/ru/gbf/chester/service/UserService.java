package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gbf.chester.UserRepository;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.entity.User;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.mapper.PetMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PetService petService;
    private final PetMapper petMapper;
    private final IntervalService intervalService;
    private final IntervalMapper intervalMapper;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<PetDTO> getPets(Long id) {
        return petService.getPets(id).stream()
                .map(petMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<IntervalDTO> getGroomerIntervals(Long id) {
        return intervalService.getGroomerIntervals(id).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }

    public List<User> getGroomers(Long salon_id) {
        return userRepository.getGroomers(salon_id);
    }
}
