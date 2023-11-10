package com.videosharing.repository;

import com.videosharing.entity.Favorite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteRepository extends JpaRepository<Favorite, Long> {
    // You can define custom database operations here
}