package com.example.Inventory.entities;

import com.example.Inventory.entities.enumerations.StatusEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Status")

public class Status {
    @Id
    @GeneratedValue

    @Column(name = "in_stock",nullable = false)
    private StatusEnum in_stock;

    @Column(name = "restock",nullable = false)
    private StatusEnum restock;

    @Column(name = "out_of_stock",nullable = false)
    private StatusEnum out_of_stock;
}

