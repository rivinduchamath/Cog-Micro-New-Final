package com.cloudofgoods.microservice.orders.service;

import com.cloudofgoods.microservice.orders.record.OrderPlace;

public interface OrderService {
    void saveOrder(OrderPlace orderPlace);
}
