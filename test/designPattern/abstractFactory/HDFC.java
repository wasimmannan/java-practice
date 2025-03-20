package com.test.designPattern.abstractFactory;

public class HDFC implements Bank {
    private final String bName;
    public HDFC(){
        bName ="HDFC BANK";
    }
    public String getBankName() {
        return bName;
    }
}
