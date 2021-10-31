package com.example.szilex.algorithmic.converters.number;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RomanNumbersConverterConvertToRomanTests {

    @Test
    public void testConvertToRomanValueOne(){
        Assertions.assertEquals("I", RomanNumbersConverter.convertToRoman(1));
    }

    @Test
    public void testConvertToRomanValueTwo(){
        Assertions.assertEquals("II", RomanNumbersConverter.convertToRoman(2));
    }

    @Test
    public void testConvertToRomanValueThree(){
        Assertions.assertEquals("III", RomanNumbersConverter.convertToRoman(3));
    }

    @Test
    public void testConvertToRomanValueFour(){
        Assertions.assertEquals("IV", RomanNumbersConverter.convertToRoman(4));
    }

    @Test
    public void testConvertToRomanValueFive(){
        Assertions.assertEquals("V", RomanNumbersConverter.convertToRoman(5));
    }

    @Test
    public void testConvertToRomanValueSeven(){
        Assertions.assertEquals("VII", RomanNumbersConverter.convertToRoman(7));
    }

    @Test
    public void testConvertToRomanValueNine(){
        Assertions.assertEquals("IX", RomanNumbersConverter.convertToRoman(9));
    }

    @Test
    public void testConvertToRomanValueTen(){
        Assertions.assertEquals("X", RomanNumbersConverter.convertToRoman(10));
    }

    @Test
    public void testConvertToRomanValueFourteen(){
        Assertions.assertEquals("XIV", RomanNumbersConverter.convertToRoman(14));
    }

    @Test
    public void testConvertToRomanValueThirtySix(){
        Assertions.assertEquals("XXXVI", RomanNumbersConverter.convertToRoman(36));
    }

    @Test
    public void testConvertToRomanValueFortyTwo(){
        Assertions.assertEquals("XLII", RomanNumbersConverter.convertToRoman(42));
    }

    @Test
    public void testConvertToRomanValueSixtySix(){
        Assertions.assertEquals("LXVI", RomanNumbersConverter.convertToRoman(66));
    }

    @Test
    public void testConvertToRomanValueNinetyNine(){
        Assertions.assertEquals("XCIX", RomanNumbersConverter.convertToRoman(99));
    }

    @Test
    public void testConvertToRomanValueOneHundred(){
        Assertions.assertEquals("C", RomanNumbersConverter.convertToRoman(100));
    }

    @Test
    public void testConvertToRomanValueOneHundredAndTwentyThree(){
        Assertions.assertEquals("CXXIII", RomanNumbersConverter.convertToRoman(123));
    }

    @Test
    public void testConvertToRomanValueFourHundredAndTwo(){
        Assertions.assertEquals("CDII", RomanNumbersConverter.convertToRoman(402));
    }

    @Test
    public void testConvertToRomanValueFourHundredAndEightyFour(){
        Assertions.assertEquals("CDLXXXIV", RomanNumbersConverter.convertToRoman(484));
    }

    @Test
    public void testConvertToRomanValueFiveHundred(){
        Assertions.assertEquals("D", RomanNumbersConverter.convertToRoman(500));
    }

    @Test
    public void testConvertToRomanValueSixHundredThirtyOne(){
        Assertions.assertEquals("DCXXXI", RomanNumbersConverter.convertToRoman(631));
    }

    @Test
    public void testConvertToRomanValueNineHundredNinetyEight(){
        Assertions.assertEquals("CMXCVIII", RomanNumbersConverter.convertToRoman(998));
    }

    @Test
    public void testConvertToRomanValueOneThousand(){
        Assertions.assertEquals("M", RomanNumbersConverter.convertToRoman(1000));
    }

    @Test
    public void testConvertToRomanValueOneThousandTwoHundredAndThirtyFour(){
        Assertions.assertEquals("MCCXXXIV", RomanNumbersConverter.convertToRoman(1234));
    }

    @Test
    public void testConvertToRomanValueOneThousandFiveHundredFiftyFour(){
        Assertions.assertEquals("MDLIV", RomanNumbersConverter.convertToRoman(1554));
    }

    @Test
    public void testConvertToRomanValueOneThousandNineHundredSeventySeven(){
        Assertions.assertEquals("MCMLXXVII", RomanNumbersConverter.convertToRoman(1977));
    }

    @Test
    public void testConvertToRomanValueTwoThousand(){
        Assertions.assertEquals("MM", RomanNumbersConverter.convertToRoman(2000));
    }

    @Test
    public void testConvertToRomanValueTwoThousandThreeHundredAndFortyFive(){
        Assertions.assertEquals("MMCCCXLV", RomanNumbersConverter.convertToRoman(2345));
    }

    @Test
    public void testConvertToRomanValueThreeThousand(){
        Assertions.assertEquals("MMM", RomanNumbersConverter.convertToRoman(3000));
    }

    @Test
    public void testConvertToRomanValueThreeThousandNineHundredNinetyNine(){
        Assertions.assertEquals("MMMCMXCIX", RomanNumbersConverter.convertToRoman(3999));
    }
}
