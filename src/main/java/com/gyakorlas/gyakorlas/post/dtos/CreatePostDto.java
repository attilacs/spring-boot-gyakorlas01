package com.gyakorlas.gyakorlas.post.dtos;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class CreatePostDto {
    @NotEmpty
    private String title;

    private String content;
}
