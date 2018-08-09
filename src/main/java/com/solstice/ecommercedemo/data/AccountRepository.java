package com.solstice.ecommercedemo.data;

import com.solstice.ecommercedemo.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

    Account findByAccountId(Long accountId);
}
