package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.IntervalDTO;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.mapper.IntervalMapper;
import ru.gbf.chester.mapper.PetMapper;
import ru.gbf.chester.mapper.UserMapper;
import ru.gbf.chester.service.IntervalService;
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

    @PostMapping
    public UserDTO save(@RequestBody UserDTO user) {
        return userMapper.toDTO(userService.create(userMapper.toEntity(user)));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
