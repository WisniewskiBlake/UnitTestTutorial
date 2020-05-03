package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import com.codewizard.unittesttutorial.Business.ItemBusinessService;
import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.ItemRepository;
import com.codewizard.unittesttutorial.Data.SomeDataService;
import com.codewizard.unittesttutorial.Model.Item;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.mockito.InjectMocks;
import org.mockito.Mock;



@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    private ItemRepository repository;

    @Autowired
    MockMvc mockMvc;

    @Test
    public void retrieveAllItems_basic() {
        when(repository.findAll()).thenReturn(Arrays.asList(new Item(2,"Item2",10,10),
        new Item(3,"Item3",20,20)));
        List<Item> items = business.retrieveAllItems();
        assertEquals(100, items.get(0).getValue());
        assertEquals(400, items.get(1).getValue());
    }

    @Test
    public void returnUserItems_Test() throws Exception {
        //call "/return-item"
        RequestBuilder request = MockMvcRequestBuilders.get("/return-item").accept(MediaType.APPLICATION_JSON);

        MvcResult actualResult = mockMvc.perform(request).andReturn();
        String expectedResult = "{id:1, name: Laptop, price: 10, quantity: 100}";
        
        //verify our result
        // assertEquals(expectedResult, actualResult.getResponse().getContentAsString(), false);

        // assertThat();
    }

    @Test
    public void calculateSumUsingDataService_empty() throws Exception {
        when(repository.retrieveAllData()).thenReturn(new int[] {});

    }

    @Test
    public void calculateSumUsingDataService_oneVal() throws Exception {
        when(ItemRepository.retrieveAllData()).thenReturn(new int[] {});

    }
    
    

}