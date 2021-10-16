package com.example.szilex.algorithmic.converters.parser;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public enum NumberString {
    ZERO(0),
    ONE(1),
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    ELEVEN(11),
    TWELVE(12),
    THIRTEEN(13),
    FOURTEEN(14),
    FIFTEEN(15),
    SIXTEEN(16),
    SEVENTEEN(17),
    EIGHTEEN(18),
    NINETEEN(19),
    TWENTY(20),
    THIRTY(30),
    FORTY(40),
    FIFTY(50),
    SIXTY(60),
    SEVENTY(70),
    EIGHTY(80),
    NINETY(90),
    HUNDRED(100),
    THOUSAND(1000),
    MILLION(1000000);

    public int value;

    NumberString(int value) {
        this.value = value;
    }

    public static int calculateValue(String[] valueStringArray) {
        List<String> formattedNumberList = new ArrayList<>(Arrays.asList(valueStringArray));
        ListIterator<String> listIterator = formattedNumberList.listIterator();
        int result = 0;
        int partialSum=0;
        boolean hundredOccurred = false;
        while(listIterator.hasNext()) {
            String value = listIterator.next().toUpperCase();
            switch (NumberString.valueOf(value)) {
                case HUNDRED: {
                    result += partialSum * HUNDRED.value;
                    hundredOccurred = true;
                    partialSum = 0;
                    break;
                }
                case THOUSAND: {
                    if (hundredOccurred) {
                        result = (result + partialSum) * THOUSAND.value;
                        hundredOccurred = false;
                    } else {
                        result += partialSum * THOUSAND.value;
                    }
                    partialSum = 0;
                    break;
                }
                case MILLION: {
                    result += partialSum * MILLION.value;
                    partialSum = 0;
                    break;
                }
                default:
                    partialSum += NumberString.valueOf(value).value;
            }
        }
        result += partialSum;
        return result;
    }
}
