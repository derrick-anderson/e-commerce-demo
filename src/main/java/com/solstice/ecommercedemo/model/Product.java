package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.util.Currency;

@Entity
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String description;
    private Currency price;
    private String imageSrc;

}
