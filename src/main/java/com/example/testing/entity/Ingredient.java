package com.example.testing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
@Entity
@Table(name = "ingredient")
public class Ingredient {
    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", nullable = false, length = 150)
    private String name;

    @Column(name = "category", nullable = false, length = 100)
    private String category;

    @Column(name = "unit", nullable = false, length = 10)
    private String unit;

    @Column(name = "stock_quantity", nullable = false, precision = 10, scale = 3)
    private BigDecimal stockQuantity;

    @Column(name = "minimum_stock", nullable = false, precision = 10, scale = 3)
    private BigDecimal minimumStock;

    @Column(name = "cost_per_unit", nullable = false, precision = 10, scale = 2)
    private BigDecimal costPerUnit;


}