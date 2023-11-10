package com.videosharing.repository;

import com.videosharing.entity.Share;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShareRepository extends JpaRepository<Share, Long> {
    // You can define custom database operations here
}