package org.example.streams;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.*;
import java.util.stream.*;

public class StreamExamples {

    public static void main(String[] args) {

        // List<String> pokemon = new List<>();

        // Data
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 5);
        List<String> names = Arrays.asList("Reflection", "Collection", "Stream", "Java");
        IntPredicate evenOnly = x -> x % 2 == 0;
        Predicate<Integer> evenOnlyPredicate = x -> x % 2 == 0;

        // intermediate operations
        // map
        List<Integer> square = numbers
                        .stream()
                        .map(x -> x * x) // called a monad
                        .collect(Collectors.toList());
        square.forEach(System.out::println);

        System.out.println("");

        // filter
        List<String> result = names
                .stream()
                .filter(s -> s.startsWith("S"))
                .collect(Collectors.toList());
        result.forEach(System.out::println);

        System.out.println("");

        // sorted
        List<String> result2 = names
                .stream()
                .sorted()
                .collect(Collectors.toList());
        result2.forEach(System.out::println);

        System.out.println("");

        // terminal operations

        // collect
        Set<Integer> squared = numbers
                .stream()
                .map(x -> x * x)
                .collect(Collectors.toSet());
        squared.forEach(System.out::println);

        System.out.println("");

        // forEach
        numbers.stream()
                .map(x -> x * x)
                .forEach(y -> System.out.println(y));

        System.out.println("");

        // reduce
        int sum = 0;
        for(int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }

        System.out.println(sum);

        int evenSum = numbers
                .stream()
                .filter(evenOnlyPredicate)
                .reduce(0, (acc, x) -> acc + x); // 0 means the "sum" starts at 0, acc is sum, x is the i
        System.out.println(evenSum);

        System.out.println("");

        // int streams
        int totalSum = IntStream.iterate(0, x -> x + 1)
                .skip(5)
                .limit(5)
                .filter(evenOnly)
                .reduce(2, Integer::sum);
        System.out.println(totalSum);

        System.out.println("");

        // random ints
        Random random = new Random();
        random.ints(1, 11)
                .limit(50)
                .forEach(System.out::println);

        System.out.println("");

        // IntStream generate

        final AtomicInteger counter = new AtomicInteger(1);
        IntStream.generate(counter::getAndIncrement) // i++
                .filter(evenOnly)
                .limit(10)
                .forEach(System.out::println);

        System.out.println("");

        // stream of random strings
        String randomString = Stream.generate(new StringGenerator())
                .limit(16)
                .collect(Collectors.joining());
        System.out.println(randomString);
    }

}
