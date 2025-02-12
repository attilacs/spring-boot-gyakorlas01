package com.gyakorlas.gyakorlas.post.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.gyakorlas.gyakorlas.post.dtos.CreatePostDto;
import com.gyakorlas.gyakorlas.post.entities.Post;
import com.gyakorlas.gyakorlas.post.services.PostService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@CrossOrigin
@RequestMapping("api/posts")
@AllArgsConstructor
public class PostController {
    private final PostService postservice;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Post postUser(@RequestBody @Valid CreatePostDto createPostDto) {
        return postservice.addPost(createPostDto);
    }

    @DeleteMapping("{id}")
    public void deletePost(@PathVariable Long id) {
        postservice.deletePostById(id);
    }
}
