package com.gyakorlas.gyakorlas.user.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreateUserDto {
    @NotEmpty
    @Email
    private String name;
}
