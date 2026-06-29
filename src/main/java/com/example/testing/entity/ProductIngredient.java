package com.example.testing.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "product_ingredient")
public class ProductIngredient {
    @EmbeddedId
    private ProductIngredientId id;

    @MapsId("ingredientId")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ingredient_id", nullable = false)
    private Ingredient ingredient;

    @Column(name = "quantity_used", nullable = false, precision = 10, scale = 3)
    private BigDecimal quantityUsed;


}