package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.mapper.PetMapper;
import ru.gbf.chester.service.PetService;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pet")
@AllArgsConstructor
public class PetController {
    private final PetService petService;
    private final PetMapper petMapper;

    @GetMapping
    public List<PetDTO> getAll() {
        return petService.getAll().stream()
                .map(petMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public PetDTO getById(@PathVariable Long id) {
        return petMapper.toDTO(petService.getById(id));
    }

    @GetMapping("/byAge")
    public List<PetDTO> getWhereAgeIsHigher(@RequestParam("age") double age) {
        return petService.getWhereAgeIsHigher(age).stream()
                .map(petMapper::toDTO)
                .collect(Collectors.toList());
    }
    // после @GetMapping добавили ("/byPrice")
    // потому что нельзя, чтобы было два GET запроса, одинаковых по структуре

    @GetMapping("/byCategory")
    public List<PetDTO> getCategory(@RequestParam("category") Long category) {
        return petService.getCategory(category).stream()
                .map(petMapper::toDTO)
                .collect(Collectors.toList());
    }

    @PostMapping
    public PetDTO save(@RequestBody PetDTO pet) {
        return petMapper.toDTO(petService.create(petMapper.toEntity(pet)));
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        petService.deleteById(id);
    }
}