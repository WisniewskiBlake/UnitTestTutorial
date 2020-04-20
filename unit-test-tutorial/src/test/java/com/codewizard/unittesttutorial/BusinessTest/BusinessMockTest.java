package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.SomeDataService;

import org.mockito.junit.MockitoJUnitRunner;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;



@ExtendWith(MockitoJUnitRunner.class)
public class BusinessMockTest {

    @InjectMocks    
    SomeBusinessImpl business = new SomeBusinessImpl();

    //mock will return retrieveAllData new int[] {1, 2, 3}
    @Mock
    SomeDataService dataServiceMock;
    
    @Test
	void calcSumUsingDataService_basic() {      
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});
        
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
	void calcSumUsingDataService_empty() {        
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });
        
        int actualResult = business.calcSumUsingDataService();        
        assertEquals(0, actualResult);
    }

    @Test
	void calcSumUsingDataService_oneValue() {        
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}