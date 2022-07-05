/**
 * @author - Chamath_Wijayarathna
 * Date :7/5/2022
 */


package com.cloudofgoods.microservice.orders.service.serviceimpl;

import com.cloudofgoods.microservice.orders.entity.OrderDetail;
import com.cloudofgoods.microservice.orders.entity.Orders;
import com.cloudofgoods.microservice.orders.record.OrderDetailRecord;
import com.cloudofgoods.microservice.orders.record.OrderPlace;
import com.cloudofgoods.microservice.orders.repository.OrderDetailsRepository;
import com.cloudofgoods.microservice.orders.repository.OrderRepository;
import com.cloudofgoods.microservice.orders.service.OrderService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;


@Service
@Slf4j
@AllArgsConstructor
@Transactional
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final OrderDetailsRepository orderDetailsRepository;
    private final RestTemplate restTemplate;
    @Override
    @Transactional
    public void saveOrder(OrderPlace request) {
        Long id =0L;
                id = request.orderId();
        System.out.println(request.orderDetails()  +" "+ request.orderId()+" ddddddddddddddddddddddddddddddddd");
        Orders orders = Orders.builder()
                .borrower_id(request.borrower_id())
                .order_status_id(request.order_status_id())
                .total_amount(request.total_amount())
                .delivery_charge(request.delivery_charge())
                .other_fee(request.other_fee())
                .customerId(request.customerId())
                .build();
        orderRepository.save(orders);
        for (OrderDetailRecord orderDetailRecord :request.orderDetails()) {
            orderDetailsRepository.save(new OrderDetail(
                    id,
                    orderDetailRecord.code(),
                    orderDetailRecord.qty(),
                    orderDetailRecord.unitPrice()

            ));
        }
    }

}
