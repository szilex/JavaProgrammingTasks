package com.example.szilex.algorithmic.generators;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Function for calculating all possible PIN combinations for given observed PIN.
 * Each observed value can be this value or any of the values adjacent to this one
 */
public class PinNumberGenerator {
    private static final Keypad keypad;

    static {
        keypad = Keypad.getKeypadBuilder()
                .addKey(1, List.of(2, 4))
                .addKey(2, List.of(1, 3, 5))
                .addKey(3, List.of(2, 6))
                .addKey(4, List.of(1, 5, 7))
                .addKey(5, List.of(2, 4, 6, 8))
                .addKey(6, List.of(3, 5, 9))
                .addKey(7, List.of(4, 8))
                .addKey(8, List.of(5, 7, 9, 0))
                .addKey(9, List.of(6, 8))
                .addKey(0, List.of(8))
                .build();
    }

    public static List<String> getPinNumbers(String observedPinNumber) {
        List<Integer> values = Stream.of(observedPinNumber.split(""))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
        List<String> resultCombinations = new ArrayList<>();
        resultCombinations.add("");
        for (var value : values) {
            List<String> newResultCombinations = new ArrayList<>();
            List<Integer> possibleValues = new ArrayList<>();
            possibleValues.add(value);
            possibleValues.addAll(keypad.getAdjacentKeys(value));
            for (var resultCombination : resultCombinations) {
                newResultCombinations.addAll(possibleValues.stream()
                        .map(x -> resultCombination + x)
                        .collect(Collectors.toList()));
            }
            resultCombinations = newResultCombinations;
        }
        return resultCombinations;
    }
}

class Keypad {
    private final Map<Integer, List<Integer>> keypadNumbers;

    private Keypad(Map<Integer, List<Integer>> keypadNumbersMap) {
        this.keypadNumbers = keypadNumbersMap;
    }

    public List<Integer> getAdjacentKeys(Integer key) {
        return keypadNumbers.get(key);
    }

    public static KeypadBuilder getKeypadBuilder() {
        return new KeypadBuilder();
    }

    public static class KeypadBuilder {
        private final Map<Integer, List<Integer>> keypadNumbers = new HashMap<>();

        public KeypadBuilder addKey(Integer key, List<Integer> adjacentKeys) {
            keypadNumbers.put(key, adjacentKeys);
            return this;
        }

        public Keypad build() {
            List<Integer> keyValues = keypadNumbers.values().stream()
                    .flatMap(List::stream)
                    .distinct()
                    .collect(Collectors.toList());
            if (keyValues.size() == keypadNumbers.keySet().size()) {
                return new Keypad(keypadNumbers);
            } else {
                throw new IllegalArgumentException("Amount of keys is different than amount of values");
            }
        }
    }
}
