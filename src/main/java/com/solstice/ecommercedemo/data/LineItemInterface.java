package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.LineItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LineItemInterface extends JpaRepository<LineItem, Long> {
}
