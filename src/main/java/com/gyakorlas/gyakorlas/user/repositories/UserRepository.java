package com.gyakorlas.gyakorlas.user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gyakorlas.gyakorlas.user.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
