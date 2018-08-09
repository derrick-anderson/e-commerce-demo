package com.solstice.ecommercedemo.service;

import com.solstice.ecommercedemo.data.AccountRepository;
import com.solstice.ecommercedemo.data.OrderRepository;
import com.solstice.ecommercedemo.model.Account;
import com.solstice.ecommercedemo.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ECommerceService {

    private AccountRepository accountRepository;
    private OrderRepository orderRepository;

    private ECommerceService(AccountRepository accountRepository, OrderRepository orderRepository){
        this.accountRepository = accountRepository;
        this.orderRepository = orderRepository;
    }

    public Account getAccountSummary(Long accountId){

        return accountRepository.findByAccountId(accountId);

    }

    public List<Order> getOrders(Long accountId){
        return orderRepository.findAllByAccount_AccountIdOrderByOrderDateAsc(accountId);
    }

}
