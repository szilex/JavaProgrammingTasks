package com.example.szilex.algorithmic.sequences.numbers;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Stream;

public class NumberPatternUtils {

    /**
     * Function calculates amount of non-strictly increasing or decreasing valued, that are less than the calculated upper limit
     * @param exponent Upper limit is calculated as 10 ^ exponent
     * @return Amount of occurrences below limit
     */
    public static BigInteger countAllIncreasingOrDecreasingValues(int exponent) {
        if (exponent == 0) {
            return BigInteger.ONE;
        } else if (exponent == 1) {
            return BigInteger.TEN;
        }

        BigInteger result = BigInteger.ZERO;
        BigInteger missedElements = BigInteger.ZERO;
        BigInteger[] previousCombinationCounts = Stream.generate(() -> BigInteger.ONE)
                .limit(10)
                .toArray(BigInteger[]::new);

        for (int depth = 0; depth < exponent; depth++) {
            BigInteger previousCombinationsAmount = Arrays.stream(previousCombinationCounts)
                    .reduce(BigInteger.ZERO, BigInteger::add);
            BigInteger[] currentCombinationCounts = new BigInteger[10];
            missedElements = missedElements.add(previousCombinationCounts[0].subtract(BigInteger.ONE));
            result = currentCombinationCounts[0] = previousCombinationsAmount;

            for (int i = 1; i < 10; i++) {
                currentCombinationCounts[i] = currentCombinationCounts[i-1].subtract(previousCombinationCounts[i-1]);
            }
            previousCombinationCounts = currentCombinationCounts;
        }

        return result.multiply(BigInteger.TWO).add(missedElements).subtract(BigInteger.valueOf(1L + exponent * 9L));
    }
}
