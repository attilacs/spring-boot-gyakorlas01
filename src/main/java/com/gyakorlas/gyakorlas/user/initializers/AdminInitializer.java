package com.gyakorlas.gyakorlas.user.initializers;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gyakorlas.gyakorlas.user.dtos.CreateUserDto;
import com.gyakorlas.gyakorlas.user.repositories.UserRepository;
import com.gyakorlas.gyakorlas.user.services.UserService;

@Configuration
public class AdminInitializer {
    @Bean
    public ApplicationRunner initAdminUser(UserRepository userRepository, UserService userService) {
        // PasswordEncoder passwordEncoder
        return args -> {
            if (userRepository.count() == 0) {
                CreateUserDto adminUser = new CreateUserDto();
                adminUser.setName("admin");
                userService.addUser(adminUser);
                System.out.println("Admin user created!");
            }
        };
    }
}
