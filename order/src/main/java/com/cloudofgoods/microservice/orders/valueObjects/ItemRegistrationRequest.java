package com.cloudofgoods.microservice.orders.valueObjects;

import java.sql.Timestamp;

public record ItemRegistrationRequest(
        String itemName,
        String item_description,
        double price,
        Timestamp created_time,
        Timestamp updated_time) {
}
