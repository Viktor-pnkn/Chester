package ru.gbf.chester.mapper;

import org.springframework.stereotype.Component;
import ru.gbf.chester.dto.PetDTO;
import ru.gbf.chester.dto.UserDTO;
import ru.gbf.chester.entity.User;

import java.util.Set;

@Component
public class UserMapper {
    public User toEntity(UserDTO userDTO) {
        return new User(
                userDTO.getId(),
                userDTO.getType(),
                userDTO.getName(),
                userDTO.getEmail(),
                userDTO.getPhone(),
                userDTO.getSalonId(),
                null
        );
    }

    public UserDTO toDTO(User user) {
        return new UserDTO(
                user.getId(),
                user.getType(),
                user.getName(),
                user.getEmail(),
                user.getPhone(),
                user.getSalonId()
        );
    }
}
