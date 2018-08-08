package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.util.Currency;

@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;

    private String name;
    private String description;
    private Currency price;

    @Column(name = "image_src")
    private String imageSrc;

}
