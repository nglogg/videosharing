package com.videosharing.repository;

import com.videosharing.entity.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
    // You can define custom database operations here
}

