package com.example.szilex.algorithmic.converters.parser;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParserTests {

    @Test
    void testParseIntZeroString() {
        String numberString = "zero";
        assertEquals(0, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntOneString() {
        String numberString = "one";
        assertEquals(1, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntTenString() {
        String numberString = "ten";
        assertEquals(10, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntFifteenString() {
        String numberString = "fifteen";
        assertEquals(15, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntTwentyTwoStringWithoutDash() {
        String numberString = "twenty two";
        assertEquals(22, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntThirtySevenStringWithDash() {
        String numberString = "thirty-seven";
        assertEquals(37, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntSeventyNineStringWithDashAndCapitalLetters() {
        String numberString = "Seventy-nine";
        assertEquals(79, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntOneHundredString() {
        String numberString = "one hundred";
        assertEquals(100, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntOneHundredTwentyThreeString() {
        String numberString = "one hundred twenty three";
        assertEquals(123, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntOneHundredAndSixtyOneString() {
        String numberString = "one hundred and sixty one";
        assertEquals(161, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntFourThousandSixHundredFiftyEightStringWithDash() {
        String numberString = "four thousand six hundred fifty-eight";
        assertEquals(4658, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntTwentyFourThousandFortyTwoString() {
        String numberString = "twenty four thousand forty two";
        assertEquals(24042, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntSevenHundredThousandString() {
        String numberString = "seven hundred thousand";
        assertEquals(700000, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntSevenHundredEightyThreeThousandNineHundredAndNineteenString() {
        String numberString = "seven hundred eighty-three thousand nine hundred and nineteen";
        assertEquals(783919, Parser.parseInt(numberString));
    }

    @Test
    void testParseIntOneMillionString() {
        String numberString = "one million";
        assertEquals(1000000, Parser.parseInt(numberString));
    }
}
