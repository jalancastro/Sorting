package org.example.fibonacci;

import java.util.HashMap;
import java.util.Map;

public class FibonacciNumbers {

    private Map<Integer, Long> dictionary = new HashMap<>();

    public static void main(String[] args) {

        FibonacciNumbers fn = new FibonacciNumbers();

        for (int i = 0; i <= 50; i++) {
            System.out.println("fib(" + i + ") = " + (fn.fib(i)));
        }

    }

    private long fib(int i) {

        if (i == 0) {
            return 0L;
        }
        if (i == 1) {
            return 1L;
        }
        return memo(i - 1) + memo(i - 2);


    }

    private long memo(int i) {

        Long value = dictionary.get(i);

        if (value != null) {
            return value;
        }

        value = fib(i);
        dictionary.put(Integer.valueOf(i), value);
        return value;
    }


}
