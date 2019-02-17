package com.preparation.multithreading;

import java.util.concurrent.Callable;

public class CallableFactorial {
    public static void main(String[] args) throws Exception {
//        long N = 20;
//        MyCallable<Long> task = new Factorial(N);
//        ExecutorService es = Executors.newSingleThreadExecutor();
//        Future<Long> future =  es.submit(task);
//        System.out.println(future.get());
//        es.shutdown();

        String s = "asd";
        s=s.substring(0, 0);
        System.out.println(s);
    }
}

class Factorial implements Callable<Long> {
    long n;

    public Factorial(long n) {
        this.n = n;
    }

    @Override
    public Long call() throws Exception {
        if (n <= 0) {
            throw new Exception("n should be > 0");
        }

        long fact = 1;
        for (long longVal = 1;longVal <= n; longVal++) {
            fact *= longVal;
        }

        return fact;
    }
}
