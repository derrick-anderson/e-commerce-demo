package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Shipment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

    List<Shipment> findAllByAccount_AccountIdOrderByShippedDateAsc(Long accountId);
}
