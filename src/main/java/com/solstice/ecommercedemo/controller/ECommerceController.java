package com.solstice.ecommercedemo.controller;

import com.solstice.ecommercedemo.service.ECommerceService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ECommerceController {

    private ECommerceService service;

    public ECommerceController(ECommerceService service){
        this.service = service;
    }

    @GetMapping("/accounts/{ID}/orders")
    public String getOrders(@PathVariable("ID") String accountId){

        return "";
    }
}
