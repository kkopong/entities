package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "Customer")

public class Customer {
    @Id
    @GeneratedValue

    @Column(name = "customer_id",unique = true,nullable = false)
    private UUID customer_id;

    @Column(name = "c_name",nullable = false)
    private UUID c_name;

    @Column(name = "c_address",nullable = false)
    private UUID c_address;

    @Column(name = "phone_number",nullable = false)
    private UUID phone_number;
}
