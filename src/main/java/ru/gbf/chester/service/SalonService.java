package ru.gbf.chester.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import ru.gbf.chester.SalonRepository;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.entity.Salon;
import ru.gbf.chester.entity.User;
import ru.gbf.chester.mapper.UserMapper;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SalonService {
    private final SalonRepository salonRepository;
    private final UserService userService;
    private final UserMapper userMapper;

    public Salon create(Salon salon) {
        return salonRepository.save(salon);
    }

    public List<UserDTO> getGroomers(Long id) {
        return userService.getGroomers(id).stream()
                .map(userMapper::toDTO)
                .collect(Collectors.toList());
    }
}
