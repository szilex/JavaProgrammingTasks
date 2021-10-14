package com.example.szilex.parser;

import java.util.stream.Stream;

public class StringInputFormatter {
    public String[] formatString(String input) {
        Stream.of(input.toLowerCase().split("[-\\s+]"))
                .filter(string -> !string.equals("and"))
                .forEach(System.out::println);

        return Stream.of(input.toLowerCase().split("[-\\s+]"))
                .filter(string -> !string.equals("and"))
                .toArray(String[]::new);
    }
}
