package com.videosharing.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "favorites")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "liked_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date likedDate;

    @ManyToOne
    @JoinColumn(name = "video_id", referencedColumnName = "id")
    private Video video;

    @ManyToOne
    @JoinColumn(name = "username", referencedColumnName = "username")
    private User user;

    // Getters and setters
}

