package com.test;

public class CalculateService {

    public static void main(String[] args) {
        CreditCalculatorService service = new CreditCalculatorService();
        try {
            ExecutionTimer.measure(() -> service.calculateCredit(1L));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
