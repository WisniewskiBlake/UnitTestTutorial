package com.codewizard.unittesttutorial.Business;

import java.util.List;

import com.codewizard.unittesttutorial.Data.ItemRepository;
import com.codewizard.unittesttutorial.Model.Item;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ItemBusinessService {

    @Autowired
    private ItemRepository repository;

    

    public List<Item> retrieveAllItems() {
        List<Item> items = repository.findAll();

        //some business logic
        for(Item item : items) {
            item.setValue(item.getPrice() * item.getQuantity());
        }
        return items;        
    }
    
}