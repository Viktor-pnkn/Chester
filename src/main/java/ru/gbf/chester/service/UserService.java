package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.UserRepository;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.entity.User;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.mapper.PetMapper;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final IntervalService intervalService;
    private final IntervalMapper intervalMapper;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<User> getGroomers(Long salon_id) {
        return userRepository.getGroomers(salon_id);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
