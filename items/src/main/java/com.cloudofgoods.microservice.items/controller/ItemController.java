/**
 * @author - Chamath_Wijayarathna
 * Date :7/4/2022
 */


package com.cloudofgoods.microservice.items.controller;

import com.cloudofgoods.microservice.items.record.ItemRegistrationRequest;
import com.cloudofgoods.microservice.items.service.ItemService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("api/v1/items")
@AllArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping      // Save Item
    public void addItem(@RequestBody ItemRegistrationRequest itemRegistrationRequest) {
        log.info("new Item adding {}", itemRegistrationRequest);
        itemService.addItem(itemRegistrationRequest);
    }
}
