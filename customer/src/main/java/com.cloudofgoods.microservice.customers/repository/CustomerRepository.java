package com.cloudofgoods.microservice.customers.repository;

import com.cloudofgoods.microservice.customers.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CustomerRepository extends JpaRepository<Customers,Long> {

}
