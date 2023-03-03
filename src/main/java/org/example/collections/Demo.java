package org.example.collections;

import java.util.*;

public class Demo {

    public static void main(String[] args) {

        // Set<String> setOfStuff = new HashSet<>();
        Set<String> setOfStuff = new LinkedHashSet<>();
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("Hi");
        setOfStuff.add("There");
        System.out.println(setOfStuff);

        // Lists

        List<String> listOfStuff = new Vector<>();
            listOfStuff.add("Hello");
            listOfStuff.add("Hello");
            listOfStuff.add("Hello");
            listOfStuff.add("Hello");
            listOfStuff.add("There");

        System.out.println(listOfStuff);
        }
    }
