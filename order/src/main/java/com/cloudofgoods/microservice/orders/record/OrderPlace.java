package com.cloudofgoods.microservice.orders.record;

import lombok.Data;

import java.util.List;



public record OrderPlace(
        Long orderId,
        int borrower_id,
        int order_status_id,
        double total_amount,
        double delivery_charge,
        double other_fee,
        Long customerId,
        List<OrderDetailRecord> orderDetails) {
}
