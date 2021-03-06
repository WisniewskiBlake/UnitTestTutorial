package com.codewizard.unittesttutorial.Controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.regex.MatchResult;

import com.codewizard.unittesttutorial.Business.ItemBusinessService;
import com.codewizard.unittesttutorial.Model.Item;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.platform.engine.TestExecutionResult.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.reactive.server.StatusAssertions;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.ResultMatcher;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ItemController.class)
public class ItemControllerTest {

    @MockBean
    private ItemBusinessService businessService;

    @Autowired
    private MockMvc mockMvc;

    
    @Test
    public void retrieveAllItems_basic() throws Exception {
        
        when(businessService.retrieveAllItems()).thenReturn(
                Arrays.asList(new Item(2,"Item2",10,10),
                            new Item(3,"Item3",20,30))
        );

        RequestBuilder request = MockMvcRequestBuilders.get("/item-from-business-service")
            .accept(MediaType.APPLICATION_JSON);

        MvcResult result = (MvcResult) mockMvc.perform(request)
        .andReturn();
        
        String expected = "[{id:2,name:Item2,price:10},{id:3,name:Item3,price:20}]";
        
        
        
        //verifying "Hello World"
         assertEquals(expected, result.getResponse().getContentAsString());
    }

}

