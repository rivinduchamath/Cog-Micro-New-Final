package com.cloudofgoods.microservice.items.repository;

import com.cloudofgoods.microservice.items.entity.Items;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<Items,Long> {
}
