package org.example.streams;

import java.util.Random;
import java.util.function.*;

public class StringGenerator implements Supplier<String> {

    Random random = new Random();
    char[] letters = "ABCDEFGHIJKMNLOPQRSTUVWXYZ".toCharArray();

    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }
}
