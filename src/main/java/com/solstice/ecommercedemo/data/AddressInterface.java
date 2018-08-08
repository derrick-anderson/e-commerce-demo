package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AddressInterface extends JpaRepository<Address, Long> {
}
