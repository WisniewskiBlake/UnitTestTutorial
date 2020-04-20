package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.SomeDataService;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class BusinessMockTest {

    SomeBusinessImpl business = new SomeBusinessImpl();
    //mock will return retrieveAllData new int[] {1, 2, 3}
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @BeforeAll
    public void before() {
        business.setSomeDataService(dataServiceMock);
    }

    @Test
	void calcSumUsingDataService_basic() {      
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});

        before();
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    
    @Test
	void calcSumUsingDataService_empty() {        
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] { });

        before();
        int actualResult = business.calcSumUsingDataService();        
        assertEquals(0, actualResult);
    }

    @Test
	void calcSumUsingDataService_oneValue() {        
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});

        before();
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 5;
        assertEquals(expectedResult, actualResult);
    }
}