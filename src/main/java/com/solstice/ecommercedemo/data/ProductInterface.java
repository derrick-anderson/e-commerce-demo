package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductInterface extends JpaRepository<Product, Long> {
}
