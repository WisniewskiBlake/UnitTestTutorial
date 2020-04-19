package com.codewizard.unittesttutorial.Business;

import com.codewizard.unittesttutorial.Data.SomeDataService;

public class SomeBusinessImpl {

    SomeDataService someDataService;

    public int calcSumUsingDataService() {
        int sum = 0;
        int[] data = someDataService.retrieveAllData();

        for(int value:data) {
            sum += value;
        }
        return sum;
    }

    

    public void setSomeDataService(SomeDataService someDataService) {
        this.someDataService = someDataService;
    }
}