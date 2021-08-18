package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gbf.chester.UserRepository;
import ru.gbf.chester.entity.Interval;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.entity.User;
import ru.gbf.chester.mapper.UserMapper;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User create(User user) {
        return userRepository.save(user);
    }

    public List<Pet> getPets(Long owner_id) {
        return userRepository.getPets(owner_id);
    }

    public List<Interval> getIntervals(Long groomer_id) {
        return userRepository.getIntervals(groomer_id);
    }
}
