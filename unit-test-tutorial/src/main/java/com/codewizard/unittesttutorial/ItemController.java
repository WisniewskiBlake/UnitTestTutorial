package com.codewizard.unittesttutorial;

import com.codewizard.unittesttutorial.Model.Item;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ItemController {

    @GetMapping("/dummy-item")
    public Item dummyItem() {
        return new Item(1, "Ball", 10, 100);
    }   
    
    @GetMapping("/item-from-business-service")
    public Item itemFromBusinessService() {
        return new Item(1, "Ball", 10, 100);
    }

}