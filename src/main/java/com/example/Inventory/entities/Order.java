package com.example.Inventory.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "Order")
public class Order {
    @Id
    @GeneratedValue

    @Column(name = "order_id",unique = true,nullable = false)
    public Enum order_id;

    @Column(name = "customer_id",unique = true,nullable = false)
    private Enum customer_id;

    @Column(name = "order_date",nullable = false)
    private Date order_date;

    @Column(name = "delivery_date",nullable = false)
    private Date delivery_date;

    @Column(name = "total_amount",nullable = false)
    private int total_amount;

    @Column(name = "price",nullable = false)
    private int price;
}
