package com.example.szilex.algorithmic.generators;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HammingNumberGeneratorTests {

    @Test
    public void testGenerateLowestHammingNumberIndexOne() {
        Assertions.assertEquals(1L, HammingNumberGenerator.generateHammingNumber(1));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwo() {
        Assertions.assertEquals(2L, HammingNumberGenerator.generateHammingNumber(2));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexThree() {
        Assertions.assertEquals(3L, HammingNumberGenerator.generateHammingNumber(3));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexFour() {
        Assertions.assertEquals(4L, HammingNumberGenerator.generateHammingNumber(4));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexFive() {
        Assertions.assertEquals(5L, HammingNumberGenerator.generateHammingNumber(5));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexSix() {
        Assertions.assertEquals(5L, HammingNumberGenerator.generateHammingNumber(6));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexSeven() {
        Assertions.assertEquals(8L, HammingNumberGenerator.generateHammingNumber(7));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexEight() {
        Assertions.assertEquals(9L, HammingNumberGenerator.generateHammingNumber(8));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexNine() {
        Assertions.assertEquals(10L, HammingNumberGenerator.generateHammingNumber(9));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTen() {
        Assertions.assertEquals(12L, HammingNumberGenerator.generateHammingNumber(10));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexEleven() {
        Assertions.assertEquals(15L, HammingNumberGenerator.generateHammingNumber(11));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwelve() {
        Assertions.assertEquals(16L, HammingNumberGenerator.generateHammingNumber(12));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexThirteen() {
        Assertions.assertEquals(18L, HammingNumberGenerator.generateHammingNumber(13));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexFourteen() {
        Assertions.assertEquals(20L, HammingNumberGenerator.generateHammingNumber(14));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexFifteen() {
        Assertions.assertEquals(24L, HammingNumberGenerator.generateHammingNumber(15));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexSixteen() {
        Assertions.assertEquals(25L, HammingNumberGenerator.generateHammingNumber(16));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexSeventeen() {
        Assertions.assertEquals(27L, HammingNumberGenerator.generateHammingNumber(17));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexEighteen() {
        Assertions.assertEquals(30L, HammingNumberGenerator.generateHammingNumber(18));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexNineteen() {
        Assertions.assertEquals(32L, HammingNumberGenerator.generateHammingNumber(19));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwenty() {
        Assertions.assertEquals(36L, HammingNumberGenerator.generateHammingNumber(20));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentyOne() {
        Assertions.assertEquals(40L, HammingNumberGenerator.generateHammingNumber(21));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentyTwo() {
        Assertions.assertEquals(45L, HammingNumberGenerator.generateHammingNumber(22));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentyThree() {
        Assertions.assertEquals(48L, HammingNumberGenerator.generateHammingNumber(23));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentyFour() {
        Assertions.assertEquals(50L, HammingNumberGenerator.generateHammingNumber(24));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentyFive() {
        Assertions.assertEquals(54L, HammingNumberGenerator.generateHammingNumber(25));
    }

    @Test
    public void testGenerateLowestHammingNumberIndexTwentySix() {
        Assertions.assertEquals(60L, HammingNumberGenerator.generateHammingNumber(26));
    }
}
