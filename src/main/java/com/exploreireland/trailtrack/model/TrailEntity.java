package com.exploreireland.trailtrack.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.locationtech.jts.geom.LineString;
import org.locationtech.jts.geom.Point;

import java.util.UUID;

@Entity
@Table(name = "trail")
public class TrailEntity {
    @Id
    private UUID id;

    private String name;
    private double distanceKm;
    private String difficulty;

    @Column(columnDefinition = "geometry(Point, 4326)")
    private Point startLocation;

    @Column(columnDefinition = "geometry(LineString, 4326)")
    private LineString path;
}
