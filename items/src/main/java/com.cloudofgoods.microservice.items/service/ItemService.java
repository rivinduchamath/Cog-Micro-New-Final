package com.cloudofgoods.microservice.items.service;

import com.cloudofgoods.microservice.items.record.ItemRegistrationRequest;

public interface ItemService {
    void addItem(ItemRegistrationRequest itemRegistrationRequest);
}
