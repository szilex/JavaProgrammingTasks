package com.example.szilex.algorithmic.generators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PinNumberGeneratorTests {

    private final static Comparator<String> comparator = String::compareTo;

    @Test
    public void testOneDigitPin() {
        List<String> expected = Arrays.asList("5", "2", "4", "6", "8");
        List<String> actual = PinNumberGenerator.getPinNumbers("5");
        expected.sort(comparator);
        actual.sort(comparator);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testTwoDigitPin() {
        List<String> expected = Arrays.asList("13", "12", "16", "23", "22", "26", "43", "42", "46");
        List<String> actual = PinNumberGenerator.getPinNumbers("13");
        expected.sort(comparator);
        actual.sort(comparator);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testThreeDigitPin() {
        List<String> expected = Arrays.asList("236", "238", "239", "256", "258", "259", "266", "268", "269", "296", "298", "299", "336", "338", "339", "356", "358", "359", "366", "368", "369", "396", "398", "399", "636", "638", "639", "656", "658", "659", "666", "668", "669", "696", "698", "699");
        List<String> actual = PinNumberGenerator.getPinNumbers("369");
        expected.sort(comparator);
        actual.sort(comparator);
        Assertions.assertEquals(expected, actual);
    }
}
