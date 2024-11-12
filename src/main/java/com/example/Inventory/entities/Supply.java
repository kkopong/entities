package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Supply")

public class Supply {
    @Id
    @GeneratedValue

    @Column(name = "supplier_id",unique = true,nullable = false)
    private UUID supplier_id;

    @Column(name = "order_id",unique = true,nullable = false)
    private UUID order_id;

    @Column(name = "origin")
    private UUID origin;

    @Column(name = "contact",nullable = false)
    private UUID contact;

    @Column(name = "quantity",nullable = false)
    private UUID quantity;

    @Column(name = "status")
    private UUID status;
}
