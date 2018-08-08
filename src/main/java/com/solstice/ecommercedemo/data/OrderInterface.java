package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderInterface extends JpaRepository<Order, Long> {
}
