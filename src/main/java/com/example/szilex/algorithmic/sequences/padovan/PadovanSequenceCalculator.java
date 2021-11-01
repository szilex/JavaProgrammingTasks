package com.example.szilex.algorithmic.sequences.padovan;

import java.math.BigInteger;

/**
 * Class for operating on Padovan sequence, in which n-th value is calculated as P(n)=P(n-2)+P(n-3) and  initial values are P(0)=P(1)=P(2)=1
 */
public class PadovanSequenceCalculator {

    public static BigInteger getPadovanValue(long n) {
        if (n==0 || n==1 || n==2) {
            return BigInteger.ONE;
        }

        BigInteger[] previousValues = new BigInteger[]{
                BigInteger.ONE,
                BigInteger.ONE,
                BigInteger.ONE
        };
        BigInteger result = BigInteger.ONE;

        for (int i = 3; i <= n; i++) {
            result = previousValues[0].add(previousValues[1]);
            previousValues[0] = previousValues[1];
            previousValues[1] = previousValues[2];
            previousValues[2] = result;
        }

        return result;
    }
}
