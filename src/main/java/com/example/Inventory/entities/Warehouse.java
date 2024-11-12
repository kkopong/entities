package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Warehouse")

public class Warehouse {
    @Id
    @GeneratedValue

    @Column(name = "warehouse_id",unique = true,nullable = false)
    private UUID warehouse_id;

    @Column(name = "location_id",unique = true,nullable = false)
    private UUID location_id;

    @Column(name = "manager_id",unique = true,nullable = false)
    private UUID manager_id;

    @Column(name = "capacity")
    private int capacity;
}
