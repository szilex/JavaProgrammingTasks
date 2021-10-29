package com.example.szilex.algorithmic.sequences.numbers;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class NumberPatternUtilsTests {

    @Test
    public void testExponentEqualOne() {
        Assertions.assertEquals(BigInteger.ONE, NumberPatternUtils.countAllIncreasingOrDecreasingValues(1));
    }

    @Test
    public void testExponentEqualTwo() {
        Assertions.assertEquals(BigInteger.TEN, NumberPatternUtils.countAllIncreasingOrDecreasingValues(2));
    }

    @Test
    public void testExponentEqualThree() {
        Assertions.assertEquals(BigInteger.valueOf(475), NumberPatternUtils.countAllIncreasingOrDecreasingValues(3));
    }

    @Test
    public void testExponentEqualFour() {
        Assertions.assertEquals(BigInteger.valueOf(1675), NumberPatternUtils.countAllIncreasingOrDecreasingValues(4));
    }

    @Test
    public void testExponentEqualFive() {
        Assertions.assertEquals(BigInteger.valueOf(4954), NumberPatternUtils.countAllIncreasingOrDecreasingValues(5));
    }

    @Test
    public void testExponentEqualSix() {
        Assertions.assertEquals(BigInteger.valueOf(12952), NumberPatternUtils.countAllIncreasingOrDecreasingValues(6));
    }
}
