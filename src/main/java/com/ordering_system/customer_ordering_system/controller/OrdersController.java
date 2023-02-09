package com.ordering_system.customer_ordering_system.controller;

import com.ordering_system.customer_ordering_system.entity.Orders;
import com.ordering_system.customer_ordering_system.service.OrdersService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/orders")
public class OrdersController {
    private final OrdersService ordersService;

    @Autowired
    public OrdersController(OrdersService ordersService) {
        this.ordersService = ordersService;
    }

    @GetMapping
    List<Orders> getOrders() {
        return ordersService.getOrders();
    }

    @GetMapping(path = "{orderId}")
    Orders getOrder(@PathVariable("orderId") Long id){
        return ordersService.getOrder(id);
    }

    @PostMapping
    void creatNewOrder(@Valid @RequestBody Orders orders){
        ordersService.addNewOrders(orders);
    }

    @DeleteMapping(path = "{orderId}")
    void deleteOrder(@PathVariable("orderId") Long orderId){
        ordersService.deleteOrder(orderId);
    }

}