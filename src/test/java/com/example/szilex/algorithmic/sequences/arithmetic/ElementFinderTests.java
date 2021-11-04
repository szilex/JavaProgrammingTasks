package com.example.szilex.algorithmic.sequences.arithmetic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ElementFinderTests {

    @Test
    public void testFindElementInCombinedSequenceIndexOne() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(1L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexTwo() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(2L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexThree() {
        Assertions.assertEquals(2L, ElementFinder.findElementInCombinedSequence(3L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexSix() {
        Assertions.assertEquals(3L, ElementFinder.findElementInCombinedSequence(6L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexTen() {
        Assertions.assertEquals(4L, ElementFinder.findElementInCombinedSequence(10L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexEleven() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(11L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexFifteen() {
        Assertions.assertEquals(5L, ElementFinder.findElementInCombinedSequence(15L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexFortyFive() {
        Assertions.assertEquals(9L, ElementFinder.findElementInCombinedSequence(45L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexFortySix() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(46L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexOneHundred() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(100L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexTwoThousandOneHundred() {
        Assertions.assertEquals(2L, ElementFinder.findElementInCombinedSequence(2100L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexOneHundredTwentyThreeThousandFourHundredAndFiftySix() {
        Assertions.assertEquals(6L, ElementFinder.findElementInCombinedSequence(123456L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexOneHundredTwentyThreeMillionFourHundredFiftySixThousandSevenHundredAndEightyNine() {
        Assertions.assertEquals(3L, ElementFinder.findElementInCombinedSequence(123456789L));
    }

    @Test
    public void testFindElementInCombinedSequenceIndexTenToPowerEighteenMinusOne() {
        Assertions.assertEquals(4L, ElementFinder.findElementInCombinedSequence(999999999999999999L));
    }

    /*@Test
    public void testFindElementInCombinedSequenceIndexTenToPowerEighteen() {
        Assertions.assertEquals(1L, ElementFinder.findElementInCombinedSequence(1000000000000000000L));
    }*/
}
