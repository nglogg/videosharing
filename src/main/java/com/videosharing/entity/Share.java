package com.videosharing.entity;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name = "shares")
public class Share {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "share_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date shareDate;

    @ManyToOne
    @JoinColumn(name = "video_id", referencedColumnName = "id")
    private Video video;

    // Getters and setters
}

