package com.codewizard.unittesttutorial.Business;

import com.codewizard.unittesttutorial.Model.Item;

import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    public Item retreiveHardcodedItem() {
        return new Item(1, "Ball", 10, 100);
    }
    
}