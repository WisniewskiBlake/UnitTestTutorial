package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import com.codewizard.unittesttutorial.Business.ItemBusinessService;
import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.ItemRepository;
import com.codewizard.unittesttutorial.Data.SomeDataService;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import org.mockito.InjectMocks;
import org.mockito.Mock;



@ExtendWith(MockitoExtension.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    private ItemBusinessService business;

    @Mock
    private ItemRepository repository;

    @Test
    public void calculateSumUsingDataService_basic() {
        when(repository.retrieveAllData()).thenReturn(new int[] { 1, 2, 3});
    }
    
    

}