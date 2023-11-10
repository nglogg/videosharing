package com.videosharing.repository;

import com.videosharing.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    // You can define custom database operations here
}
