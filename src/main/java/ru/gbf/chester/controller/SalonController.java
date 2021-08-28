package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.SalonDTO;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.entity.Salon;
import ru.gbf.chester.mapper.SalonMapper;
import ru.gbf.chester.mapper.UserMapper;
import ru.gbf.chester.service.SalonService;
import ru.gbf.chester.service.UserService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
@RequestMapping("/salon")
public class SalonController {
    private final SalonService salonService;
    private final SalonMapper salonMapper;

    @PostMapping
    public SalonDTO create(@RequestBody SalonDTO salonDTO) {
        return salonMapper.toDTO(salonService.create(salonMapper.toEntity(salonDTO)));
    }

    /**
     * Вывод всех грумеров, работающих в салоне с указанным id
     */
    @GetMapping("/getGroomers")
    public List<UserDTO> getGroomers(@RequestParam("id") Long id) {
        return salonService.getGroomers(id);
    }
}
