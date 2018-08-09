package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAllByAccount_AccountIdOrderByOrderDateAsc(Long accountId);
}
