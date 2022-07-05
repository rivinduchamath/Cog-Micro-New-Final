package com.cloudofgoods.microservice.customers.service;


import com.cloudofgoods.microservice.customers.record.CustomerRegistrationRequest;

public interface CustomerService {
    void addCustomers(CustomerRegistrationRequest customerRegistrationRequest);
}
