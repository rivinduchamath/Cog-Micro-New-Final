package com.cloudofgoods.microservice.items.record;

import java.sql.Timestamp;

public record ItemRegistrationRequest(
        String itemName,
        String item_description,
        double price,
        Timestamp created_time,
        Timestamp updated_time) {
}
