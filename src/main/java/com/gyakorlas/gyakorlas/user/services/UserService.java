package com.gyakorlas.gyakorlas.user.services;

import org.springframework.stereotype.Service;

import com.gyakorlas.gyakorlas.user.dtos.CreateUserDto;
import com.gyakorlas.gyakorlas.user.entities.User;
import com.gyakorlas.gyakorlas.user.repositories.UserRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser(CreateUserDto createUserDto) {
        return userRepository.save(userInputToEntity(createUserDto));
    }

    private User userInputToEntity(CreateUserDto createUserDto) {
        Boolean isFirstUser = userRepository.count() == 0;
        return User.builder()
                .name(createUserDto.getName())
                .password("password")
                .isAdmin(isFirstUser)
                .build();
    }

    public void deleteUserById(Long id) {
        User user = userRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("User not found with id: " + id));
        if (user.getIsAdmin()) {
            throw new IllegalStateException("Admin user cannot be deleted.");
        }
        userRepository.deleteById(id);
        ;
    }
}
