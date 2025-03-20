package com.test.designPattern.abstractFactory;

public class ICICI implements Bank {
    private final String bName;
    public ICICI(){
        bName ="ICICI BANK";
    }
    public String getBankName() {
        return bName;
    }
}
