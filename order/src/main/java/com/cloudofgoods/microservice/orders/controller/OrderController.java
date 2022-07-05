/**
 * @author - Chamath_Wijayarathna
 * Date :7/5/2022
 */


package com.cloudofgoods.microservice.orders.controller;

import com.cloudofgoods.microservice.orders.record.OrderPlace;
import com.cloudofgoods.microservice.orders.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@AllArgsConstructor
@RequestMapping("/api/v1/orders")
public class OrderController {
    private final OrderService orderService;


    @PostMapping
    public void saveOrder(@RequestBody OrderPlace orderPlace){

        System.out.println(orderPlace+"  SSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
        orderService.saveOrder(orderPlace);
    }

}
