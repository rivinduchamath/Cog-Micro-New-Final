/**
 * @author - Chamath_Wijayarathna
 * Date :7/4/2022
 */


package com.cloudofgoods.microservice.items.service.impl;

import com.cloudofgoods.microservice.items.entity.Items;
import com.cloudofgoods.microservice.items.record.ItemRegistrationRequest;
import com.cloudofgoods.microservice.items.repository.ItemRepository;
import com.cloudofgoods.microservice.items.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@Slf4j
public class ItemServiceImpl implements ItemService {

    private final ItemRepository itemRepository;

    @Override
    public void addItem(ItemRegistrationRequest request) {
        Items items = Items.builder()
                .itemName(request.itemName())
                .item_description(request.item_description())
                .price(request.price())
                .created_time(request.created_time())
                .updated_time(request.updated_time())
                .build();
        itemRepository.save(items);

    }
}
