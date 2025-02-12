package com.gyakorlas.gyakorlas.post.services;

import org.springframework.stereotype.Service;

import com.gyakorlas.gyakorlas.post.dtos.CreatePostDto;
import com.gyakorlas.gyakorlas.post.entities.Post;
import com.gyakorlas.gyakorlas.post.repositories.PostRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PostService {
    private final PostRepository postRepository;

    public Post addPost(CreatePostDto createPostDto) {
        return postRepository.save(postInputToEntity(createPostDto));
    }

    private Post postInputToEntity(CreatePostDto createPostDto) {
        return Post.builder()
                .title(createPostDto.getTitle())
                .content(createPostDto.getContent())
                .build();
    }

    public void deletePostById(Long id) {
        postRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Post not found with id: " + id));
        postRepository.deleteById(id);
        ;
    }
}
