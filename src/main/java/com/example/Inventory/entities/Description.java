package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Description")

public class Description {
    @Id
    @GeneratedValue

    @Column(name = "product_name", unique = true, nullable = false)
    private String product_name;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "manu_company", nullable = false)
    private String manu_company;

    @Column(name = "functionality", nullable = false)
    private String functionality;

    @Column(name = "quantity", nullable = false)
    private int quantity;
}
