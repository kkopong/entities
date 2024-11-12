package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Location")

public class Location {
    @Id
    @GeneratedValue

    @Column(name = "location_id",unique = true,nullable = false)
    private UUID location_id;

    @Column(name = "section")
    private String section;

    @Column(name = "shelf_number")
    private int shelf_number;

    @Column(name = "shelf_row")
    private int shelf_row;
}
