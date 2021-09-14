package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.dto.UserTestDTO;
import ru.gbf.chester.entity.User;

@Component
public class UserTestMapper {
    public User toEntity(UserTestDTO userTestDTO) {
        return new User(
                userTestDTO.getId(),
                userTestDTO.getType(),
                userTestDTO.getName(),
                userTestDTO.getEmail(),
                userTestDTO.getPhone(),
                userTestDTO.getSalonId(),
                userTestDTO.getPets()
        );
    }

    public UserTestDTO toDTO(User user) {
        return new UserTestDTO(
                user.getId(),
                user.getType(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getSalonId(),
                user.getPets()
        );
    }
}
