package com.codewizard.unittesttutorial.Business;

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
}