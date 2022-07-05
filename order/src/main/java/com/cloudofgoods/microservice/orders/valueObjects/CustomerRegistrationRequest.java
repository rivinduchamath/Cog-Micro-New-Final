package com.cloudofgoods.microservice.orders.valueObjects;

import java.util.Date;

public record CustomerRegistrationRequest(
        String customer_name,
        String customer_description,
        String address,
        Date created_time,
        int mobile_number) {
}
