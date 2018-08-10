package com.solstice.ecommercedemo.controller;

import com.solstice.ecommercedemo.model.Account;
import com.solstice.ecommercedemo.model.Order;
import com.solstice.ecommercedemo.model.Shipment;
import com.solstice.ecommercedemo.service.ECommerceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/api")
public class ECommerceController {

    private ECommerceService service;

    public ECommerceController(ECommerceService service){
        this.service = service;
    }

    @GetMapping("/accounts/{ID}")
    public Account getAccountSummary(@PathVariable("ID") Long accountId){

        return service.getAccountSummary(accountId);
    }

    @GetMapping("/accounts/{ID}/orders")
    public List<Order> getOrders(@PathVariable("ID") Long accountId){
        return service.getOrders(accountId);
    }

    @GetMapping("/accounts/{ID}/shipments")
    public List<Shipment> getShipments(@PathVariable("ID") Long accountId){
        return service.getShipments(accountId);
    }

}
