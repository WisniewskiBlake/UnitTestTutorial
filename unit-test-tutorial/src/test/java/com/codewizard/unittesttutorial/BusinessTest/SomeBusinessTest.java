package com.codewizard.unittesttutorial.BusinessTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.codewizard.unittesttutorial.Business.SomeBusinessImpl;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SomeBusinessTest {

	@Test
	void calcSum() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 8;
        assertEquals(expectedResult, actualResult);
    }
    

    @Test
	void calcSumEmpty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult, actualResult);
	}

}