package com.solstice.ecommercedemo.model;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Embeddable
@Table(name = "products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productId;
    private String name;
    private String description;
    private BigDecimal price;
    private String imageSrc;

    public Product() {
    }

    public Product(String name, String description, BigDecimal price, String imageSrc) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageSrc = imageSrc;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageSrc() {
        return imageSrc;
    }

    public void setImageSrc(String imageSrc) {
        this.imageSrc = imageSrc;
    }
}
