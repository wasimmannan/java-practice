package com.test;

public class CreditCalculatorService {

    long totalBalance = 1000;

    public long calculateCredit(long l) throws Exception{
        if(totalBalance < l) {
            throw new Exception("Total balance is less than the credit amount");
        }
        Thread.sleep(10000);
        return totalBalance - l;
    }
}
