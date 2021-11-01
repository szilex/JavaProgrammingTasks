package com.example.szilex.algorithmic.sequences.padovan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

public class PadovanSequenceCalculatorTests {

    @Test
    public void testGetPadovanValueZero() {
        Assertions.assertEquals(BigInteger.ONE, PadovanSequenceCalculator.getPadovanValue(0));
    }

    @Test
    public void testGetPadovanValueOne() {
        Assertions.assertEquals(BigInteger.ONE, PadovanSequenceCalculator.getPadovanValue(1));
    }

    @Test
    public void testGetPadovanValueTwo() {
        Assertions.assertEquals(BigInteger.ONE, PadovanSequenceCalculator.getPadovanValue(2));
    }

    @Test
    public void testGetPadovanValueThree() {
        Assertions.assertEquals(BigInteger.TWO, PadovanSequenceCalculator.getPadovanValue(3));
    }

    @Test
    public void testGetPadovanValueFour() {
        Assertions.assertEquals(BigInteger.TWO, PadovanSequenceCalculator.getPadovanValue(4));
    }

    @Test
    public void testGetPadovanValueFive() {
        Assertions.assertEquals(BigInteger.valueOf(3), PadovanSequenceCalculator.getPadovanValue(5));
    }

    @Test
    public void testGetPadovanValueSeven() {
        Assertions.assertEquals(BigInteger.valueOf(5), PadovanSequenceCalculator.getPadovanValue(7));
    }

    @Test
    public void testGetPadovanValueTen() {
        Assertions.assertEquals(BigInteger.valueOf(12), PadovanSequenceCalculator.getPadovanValue(10));
    }

    @Test
    public void testGetPadovanValueFifteen() {
        Assertions.assertEquals(BigInteger.valueOf(49), PadovanSequenceCalculator.getPadovanValue(15));
    }

    @Test
    public void testGetPadovanValueEighteen() {
        Assertions.assertEquals(BigInteger.valueOf(114), PadovanSequenceCalculator.getPadovanValue(18));
    }
    @Test
    public void testGetPadovanValueTwenty() {
        Assertions.assertEquals(BigInteger.valueOf(200), PadovanSequenceCalculator.getPadovanValue(20));
    }

}
