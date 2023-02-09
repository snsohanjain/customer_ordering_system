package com.ordering_system.customer_ordering_system.repository;

import com.ordering_system.customer_ordering_system.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders,Long> {

}