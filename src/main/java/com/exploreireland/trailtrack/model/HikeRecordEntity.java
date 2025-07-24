package com.exploreireland.trailtrack.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "hike_record")
public class HikeRecordEntity {
    @Id
    private UUID id;

    @ManyToOne
    @JoinColumn(name="user_id")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name="trail_id")
    private TrailEntity trail;

    private LocalDateTime startedAt;
    private LocalDateTime completedAt;
    private double totalDistance;
}
