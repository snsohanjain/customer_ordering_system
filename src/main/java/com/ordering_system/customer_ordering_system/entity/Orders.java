package com.ordering_system.customer_ordering_system.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table
public class Orders {

    @Id
    private Long orderId;

    private String productName;

    private int noOfQuantity;

    private String customerName;


}