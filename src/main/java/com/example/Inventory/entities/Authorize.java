package com.example.Inventory.entities;

import com.example.Inventory.entities.enumerations.AuthorizeEnum;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Status")

public class Authorize {
    @Id
    @GeneratedValue

    @Column(name = "ACCEPT",nullable = false)
    private AuthorizeEnum accept;

    @Column(name = "DECLINE",nullable = false)
    private AuthorizeEnum decline;
}

