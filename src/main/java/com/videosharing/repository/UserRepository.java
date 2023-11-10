package com.videosharing.repository;

import com.videosharing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    // You can define custom database operations here
}

