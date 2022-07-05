package com.cloudofgoods.microservice.orders.valueObjects;

import com.cloudofgoods.microservice.orders.record.OrderPlace;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private ItemRegistrationRequest item;
    private CustomerRegistrationRequest customer;
    private OrderPlace orderPlace;
}
