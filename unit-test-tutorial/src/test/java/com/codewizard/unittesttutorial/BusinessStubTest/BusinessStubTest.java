package com.codewizard.unittesttutorial.BusinessStubTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;
import com.codewizard.unittesttutorial.Data.SomeDataService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class SomeDataServiceStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        // TODO Auto-generated method stub
        return new int[] {1, 2, 3};
    }    
}

class SomeDataServiceEmptyStub implements SomeDataService {
    @Override
    public int[] retrieveAllData() {
        // TODO Auto-generated method stub
        return new int[] {1, 2, 3};
    }    
}

@SpringBootTest
class BusinessStubTest {
	@Test
	void calcSumUsingDataService() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        business.setSomeDataService(new SomeDataServiceStub());
        int actualResult = business.calcSumUsingDataService();
        int expectedResult = 6;
        assertEquals(expectedResult, actualResult);
    }  
}