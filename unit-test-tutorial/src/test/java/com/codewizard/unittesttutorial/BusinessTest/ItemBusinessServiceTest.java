package com.codewizard.unittesttutorial.BusinessTest;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.MockitoJUnitRunner;

import com.codewizard.unittesttutorial.Business.ItemBusinessService;

@ExtendWith(MockitoJUnitRunner.class)
public class ItemBusinessServiceTest {

    @InjectMocks
    ItemBusinessService business;

    @Mock
    SomeDataService dataServiceMock;

    
    

}