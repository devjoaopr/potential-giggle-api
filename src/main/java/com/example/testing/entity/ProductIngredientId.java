package com.example.testing.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.UUID;

@Getter
@Setter
@EqualsAndHashCode
@Embeddable
public class ProductIngredientId implements Serializable {
    private static final long serialVersionUID = -165738688869574816L;
    @Column(name = "product_id", nullable = false)
    private UUID productId;

    @Column(name = "ingredient_id", nullable = false)
    private UUID ingredientId;


}