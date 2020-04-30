package com.codewizard.unittesttutorial.Data;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import com.codewizard.unittesttutorial.Model.Item;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@ExtendWith(MockitoExtension.class)
@DataJpaTest
public class ItemRepositoryTest {

    @Autowired
    private ItemRepository repository;

    @Test
    public void testFindAll() {
        List<Item> items = repository.findAll();
        assertEquals(3, items.size());
    }

}