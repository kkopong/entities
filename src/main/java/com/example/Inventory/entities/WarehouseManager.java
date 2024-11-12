package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "WarehouseManager")

public class WarehouseManager {
    @Id
    @GeneratedValue

    @Column(name = "manager_id", unique = true, nullable = false)
    private UUID product_id;

    @Column(name = "name", nullable = false)
    private UUID name;

    @Column(name = "contact")
    private UUID contact;
}
