package com.example.szilex.algorithmic.converters.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumbersConverterConvertToIntegerTests {

    @Test
    public void testConvertToRomanValueOne(){
        Assertions.assertEquals(1, RomanNumbersConverter.convertToInteger("I"));
    }

    @Test
    public void testConvertToRomanValueTwo(){
        Assertions.assertEquals(2, RomanNumbersConverter.convertToInteger("II"));
    }

    @Test
    public void testConvertToRomanValueThree(){
        Assertions.assertEquals(3, RomanNumbersConverter.convertToInteger("III"));
    }

    @Test
    public void testConvertToRomanValueFour(){
        Assertions.assertEquals(4, RomanNumbersConverter.convertToInteger("IV"));
    }

    @Test
    public void testConvertToRomanValueFive(){
        Assertions.assertEquals(5, RomanNumbersConverter.convertToInteger("V"));
    }

    @Test
    public void testConvertToRomanValueSeven(){
        Assertions.assertEquals(7, RomanNumbersConverter.convertToInteger("VII"));
    }

    @Test
    public void testConvertToRomanValueNine(){
        Assertions.assertEquals(9, RomanNumbersConverter.convertToInteger("IX"));
    }

    @Test
    public void testConvertToRomanValueTen(){
        Assertions.assertEquals(10, RomanNumbersConverter.convertToInteger("X"));
    }

    @Test
    public void testConvertToRomanValueFourteen(){
        Assertions.assertEquals(14, RomanNumbersConverter.convertToInteger("XIV"));
    }

    @Test
    public void testConvertToRomanValueThirtySix(){
        Assertions.assertEquals(36, RomanNumbersConverter.convertToInteger("XXXVI"));
    }

    @Test
    public void testConvertToRomanValueFortyTwo(){
        Assertions.assertEquals(42, RomanNumbersConverter.convertToInteger("XLII"));
    }

    @Test
    public void testConvertToRomanValueSixtySix(){
        Assertions.assertEquals(66, RomanNumbersConverter.convertToInteger("LXVI"));
    }

    @Test
    public void testConvertToRomanValueNinetyNine(){
        Assertions.assertEquals(99, RomanNumbersConverter.convertToInteger("XCIX"));
    }

    @Test
    public void testConvertToRomanValueOneHundred(){
        Assertions.assertEquals(100, RomanNumbersConverter.convertToInteger("C"));
    }

    @Test
    public void testConvertToRomanValueOneHundredTwentyThree(){
        Assertions.assertEquals(123, RomanNumbersConverter.convertToInteger("CXXIII"));
    }

    @Test
    public void testConvertToRomanValueFourHundredAndTwo(){
        Assertions.assertEquals(402, RomanNumbersConverter.convertToInteger("CDII"));
    }

    @Test
    public void testConvertToRomanValueFourHundredAndEightyFour(){
        Assertions.assertEquals(484, RomanNumbersConverter.convertToInteger("CDLXXXIV"));
    }

    @Test
    public void testConvertToRomanValueFiveHundred(){
        Assertions.assertEquals(500, RomanNumbersConverter.convertToInteger("D"));
    }

    @Test
    public void testConvertToRomanValueSixHundredThirtyOne(){
        Assertions.assertEquals(631, RomanNumbersConverter.convertToInteger("DCXXXI"));
    }

    @Test
    public void testConvertToRomanValueNineHundredNinetyEight(){
        Assertions.assertEquals(998, RomanNumbersConverter.convertToInteger("CMXCVIII"));
    }

    @Test
    public void testConvertToRomanValueOneThousand(){
        Assertions.assertEquals(1000, RomanNumbersConverter.convertToInteger("M"));
    }

    @Test
    public void testConvertToRomanValueOneThousandTwoHundredAndThirtyFour(){
        Assertions.assertEquals(1234, RomanNumbersConverter.convertToInteger("MCCXXXIV"));
    }

    @Test
    public void testConvertToRomanValueOneThousandFiveHundredFiftyFour(){
        Assertions.assertEquals(1554, RomanNumbersConverter.convertToInteger("MDLIV"));
    }

    @Test
    public void testConvertToRomanValueOneThousandNineHundredSeventySeven(){
        Assertions.assertEquals(1977, RomanNumbersConverter.convertToInteger("MCMLXXVII"));
    }

    @Test
    public void testConvertToRomanValueTwoThousand(){
        Assertions.assertEquals(2000, RomanNumbersConverter.convertToInteger("MM"));
    }

    @Test
    public void testConvertToRomanValueTwoThousandThreeHundredAndFortyFive(){
        Assertions.assertEquals(2345, RomanNumbersConverter.convertToInteger("MMCCCXLV"));
    }

    @Test
    public void testConvertToRomanValueThreeThousand(){
        Assertions.assertEquals(3000, RomanNumbersConverter.convertToInteger("MMM"));
    }

    @Test
    public void testConvertToRomanValueThreeThousandNineHundredNinetyNine(){
        Assertions.assertEquals(3999, RomanNumbersConverter.convertToInteger("MMMCMXCIX"));
    }
}
