/**
 * @author - Chamath_Wijayarathna
 * Date :7/4/2022
 */


package com.cloudofgoods.microservice.customers.service.impl;


import com.cloudofgoods.microservice.customers.entity.Customers;
import com.cloudofgoods.microservice.customers.record.CustomerRegistrationRequest;
import com.cloudofgoods.microservice.customers.repository.CustomerRepository;
import com.cloudofgoods.microservice.customers.service.CustomerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository itemRepository;

    @Override
    public void addCustomers(CustomerRegistrationRequest request) {
        Customers items = Customers.builder()
                .customer_name(request.customer_name())
                .customer_description(request.customer_description())
                .address(request.address())
                .created_time(request.created_time())
                .mobile_number(request.mobile_number())
                .build();
        itemRepository.save(items);

    }

}
