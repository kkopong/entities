package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Product")

public class Product {
    @Id
    @GeneratedValue

    @Column(name = "product_id", unique = true, nullable = false)
    private UUID product_id;

    @Column(name = "supplier_id", nullable = false)
    private UUID supplier_id;

    @Column(name = "location_id", nullable = false)
    private UUID location_id;

    @Column(name = "manu_date", nullable = false)
    private Date manu_date;

    @Column(name = "p_name", nullable = false)
    private String p_name;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "weight", nullable = false)
    private int weight;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "exp_date", nullable = false)
    private Date exp_date;
}
