package com.example.szilex.parser;

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
        int result = 0;
        List<String> formattedNumberList = new ArrayList<>(Arrays.asList(valueStringArray));
        ListIterator<String> listIterator = formattedNumberList.listIterator();
        while(listIterator.hasNext()) {
            int partialSum=0;
            loop: while(listIterator.hasNext()) {
                String value = listIterator.next().toUpperCase();
                switch (NumberString.valueOf(value)) {
                    case HUNDRED: {
                        if (partialSum == 0) {
                            partialSum = HUNDRED.value;
                        } else {
                            partialSum *= HUNDRED.value;
                        }
                        int offset = 0;
                        while(listIterator.hasNext()) {
                            offset++;
                            String tempValue = listIterator.next();
                            if (NumberString.valueOf(tempValue.toUpperCase()).equals(THOUSAND)) {
                                partialSum *= THOUSAND.value;
                            }
                        }
                        for (; offset>0; offset--) {
                            listIterator.previous();
                        }
                        break loop;
                    }
                    case THOUSAND: {
                        if (partialSum == 0) {
                            partialSum = THOUSAND.value;
                        } else {
                            partialSum *= THOUSAND.value;
                        }
                        break loop;
                    }
                    case MILLION: {
                        if (partialSum == 0) {
                            partialSum = MILLION.value;
                        } else {
                            partialSum *= MILLION.value;
                        }
                        break loop;
                    }
                    default:
                        partialSum += NumberString.valueOf(value).value;
                }
            }
            result += partialSum;
        }
        return result;
    }
}
