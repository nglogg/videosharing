package com.videosharing.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long categoryId;

    @Column(name = "categoryname", nullable = false, length = 100)
    private String categoryName;

    @Column(name = "categorycode", length = 100)
    private String categoryCode;

    @Column(name = "images")
    private String images;

    @Column(name = "status")
    private boolean status;

    // Getters and setters
}

