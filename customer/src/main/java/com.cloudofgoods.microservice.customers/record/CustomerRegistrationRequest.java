package com.cloudofgoods.microservice.customers.record;

import java.util.Date;

public record CustomerRegistrationRequest(
        String customer_name,
        String customer_description,
        String address,
        Date created_time,
        int mobile_number) {
}
