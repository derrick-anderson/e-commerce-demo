package com.solstice.ecommercedemo.service;

import com.solstice.ecommercedemo.data.AccountRepository;
import com.solstice.ecommercedemo.data.OrderRepository;
import com.solstice.ecommercedemo.data.ShipmentRepository;
import com.solstice.ecommercedemo.model.Account;
import com.solstice.ecommercedemo.model.Order;
import com.solstice.ecommercedemo.model.Shipment;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ECommerceService {

    private AccountRepository accountRepository;
    private OrderRepository orderRepository;
    private ShipmentRepository shipmentRepository;

    public ECommerceService(AccountRepository accountRepository, OrderRepository orderRepository, ShipmentRepository shipmentRepository) {
        this.accountRepository = accountRepository;
        this.orderRepository = orderRepository;
        this.shipmentRepository = shipmentRepository;
    }

    public Account getAccountSummary(Long accountId){

        return accountRepository.findByAccountId(accountId);

    }

    public List<Order> getOrders(Long accountId){
        return orderRepository.findAllByAccount_AccountIdOrderByOrderDateAsc(accountId);
    }

    public List<Shipment> getShipments(Long accountId){
        return shipmentRepository.findAllByAccount_AccountIdOrderByShippedDateAsc(accountId);
    }

}
