package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.SomeDataService;

import org.junit.jupiter.api.Test;

public class BusinessMockTest {
    @Test
	void calcSumUsingDataService_oneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        //mock will return retrieveAllData new int[] {1, 2, 3}
        SomeDataService dataServiceMock = mock(SomeDataService.class);
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1, 2, 3});

        business.setSomeDataService(dataServiceMock);
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }
    
    // @Test
	// void calcSumUsingDataService_empty() {
    //     SomeBusinessImpl business = new SomeBusinessImpl();
    //     business.setSomeDataService(new SomeDataServiceStub());
    //     int actualResult = business.calcSumUsingDataService();
    //     int expectedResult = 0;
    //     assertEquals(expectedResult, actualResult);
    // }
}