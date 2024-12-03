package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Entity
@Getter
@Setter
@Table(name = "Admin")

public class Admin {
    @Id
    @GeneratedValue

    @Column(name = "admin_id", unique = true, nullable = false)
    private UUID admin_id;

    @Column(name = "user_id", nullable = false)
    private UUID user_id;

    @Column(name = "description")
    private String description;

    @Column(name = "Authorize")
    private String Authorize;
}
