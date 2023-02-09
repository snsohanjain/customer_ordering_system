package com.ordering_system.customer_ordering_system.service;

import com.ordering_system.customer_ordering_system.entity.Orders;
import com.ordering_system.customer_ordering_system.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    public OrdersService(OrdersRepository ordersRepository) {
        this.ordersRepository = ordersRepository;
    }
    private final OrdersRepository ordersRepository;
    @GetMapping
    public List<Orders> getOrders(){
        return ordersRepository.findAll();
    }
    @GetMapping
    public Orders getOrder(Long id){
        return ordersRepository.findById(id).orElseThrow(() ->
                new IllegalArgumentException(
                        "Order " + id + " not found"));
    }
    @PostMapping
    public void addNewOrders(Orders orders){
        if(orders.getNoOfQuantity() > 10 && orders.getNoOfQuantity() <=20){
            System.out.println("Eligible for 10% Discount");
        } else if (orders.getNoOfQuantity() > 20) {
            System.out.println("Eligible for 20% Discount");
        }
        ordersRepository.save(orders);
    }
    @DeleteMapping
    public void deleteOrder(Long orderId){
        boolean exists = ordersRepository.existsById(orderId);
        if(!exists){
            throw new IllegalStateException("Order with id "+ orderId + " does not exists");
        }
        ordersRepository.deleteById(orderId);
    }

}