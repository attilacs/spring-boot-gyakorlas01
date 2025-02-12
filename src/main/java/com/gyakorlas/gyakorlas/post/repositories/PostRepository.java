package com.gyakorlas.gyakorlas.post.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyakorlas.gyakorlas.post.entities.Post;

public interface PostRepository extends JpaRepository<Post, Long> {
}
