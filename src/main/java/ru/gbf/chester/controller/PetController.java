package ru.gbf.chester.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.gbf.chester.entity.Pet;
import ru.gbf.chester.service.PetService;

import java.util.List;

@RestController
@RequestMapping("/pet")
@AllArgsConstructor
public class PetController {
    private final PetService petService;

    @GetMapping
    public List<Pet> getAll() {
        return petService.getAll();
    }

    @GetMapping("/{id}")
    public Pet getAllById(@PathVariable Long id) {
        return petService.getById(id);
    }

    @GetMapping("/byPrice")
    public List<Pet> getWhereAgeIsHigher(@RequestParam("age") double age) {
        return petService.getWhereAgeIsHigher(age);
    }
    // после @GetMapping добавили ("/byPrice")
    // потому что нельзя, чтобы было два GET запроса, одинаковых по структуре

    @GetMapping("/byCategory")
    public List<Pet> getCategory(@RequestParam("category") Long category) {
        return petService.getCategory(category);
    }

    @PostMapping
    public Pet save(@RequestBody Pet pet) {
        return petService.create(pet);
    }
}