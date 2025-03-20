package com.test;

import java.util.concurrent.Callable;
public class ExecutionTimer {
    public static <T> T measure(Callable<T> task) throws Exception {
        long startTime = System.nanoTime();
        try {
            T result = task.call();
            var endTime = System.nanoTime();
            var duration = (endTime - startTime) / 1_000_000;  // Convert to milliseconds
            System.out.println("Execution time: " + duration + " milliseconds");
            return result;
        } catch (Exception e) {
            throw e;
        }
    }
}