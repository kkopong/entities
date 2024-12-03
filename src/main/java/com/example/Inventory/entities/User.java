package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue

    @Column(name = "user_id",unique = true,nullable = false)
    private UUID user_id;

    @Column(name = "user_name",unique = true,nullable = false)
    private UUID user_name;

    @Column(name = "request_device",nullable = false)
    private String request_device;
}
