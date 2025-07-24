package com.exploreireland.trailtrack.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    private UUID id;

    private String username;
    private String email;
    private LocalDate dateJoined;
}

