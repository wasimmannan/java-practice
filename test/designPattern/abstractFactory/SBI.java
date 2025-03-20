package com.test.designPattern.abstractFactory;

public class SBI implements Bank {
    private final String bName;
    public SBI(){
        bName ="SBI BANK";
    }
    public String getBankName() {
        return bName;
    }
}
