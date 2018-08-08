package com.solstice.ecommercedemo.service;

import com.solstice.ecommercedemo.data.AccountRepository;
import com.solstice.ecommercedemo.data.OrderRepository;
import com.solstice.ecommercedemo.model.Account;
import org.springframework.stereotype.Service;

@Service
public class ECommerceService {

    private AccountRepository accountRepository;
    private OrderRepository orderRepository;

    private ECommerceService(AccountRepository accountRepository, OrderRepository orderRepository){
        this.accountRepository = accountRepository;
        this.orderRepository = orderRepository;
    }

    public Account getOrders(Long accountId){
        return null;
    }
}
