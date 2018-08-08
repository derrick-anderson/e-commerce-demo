package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShipmentInterface extends JpaRepository<Shipment, Long> {
}
