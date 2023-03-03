package org.example.Lambda;

import java.util.function.*;

public class LambdaDemo {

    public static void main(String[] args) {

        // 4 types of lambdas

        // takes value, returns boolean
        Predicate<String> predicate = x -> x.startsWith("a");

        // takes value, returns a value
        Function<Integer, Integer> function = x -> x * 2;

        // takes nothing, returns a value
        Supplier<String> supplier = () -> "Hello Lambda!";

        // takes a value, returns nothing
        Consumer<String> consumer = System.out::println; // or x -> sout(x)



    }
}