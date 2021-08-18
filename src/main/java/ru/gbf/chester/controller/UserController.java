package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.entity.User;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.mapper.PetMapper;
import ru.gbf.chester.mapper.UserMapper;
import ru.gbf.chester.service.PetService;
import ru.gbf.chester.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserMapper userMapper;
    private final PetMapper petMapper;
    private final IntervalMapper intervalMapper;

    @PostMapping
    public UserDTO save(@RequestBody UserDTO user) {
        return userMapper.toDTO(userService.create(userMapper.toEntity(user)));
    }

    @GetMapping("/getPets")
    public List<PetDTO> getPets(@RequestParam("id") Long id) {
        return userService.getPets(id).stream()
                .map(petMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/getIntervals")
    public List<IntervalDTO> getIntervals(@RequestParam("id") Long id) {
        return userService.getIntervals(id).stream()
                .map(intervalMapper::toDTO)
                .collect(Collectors.toList());
    }
}
