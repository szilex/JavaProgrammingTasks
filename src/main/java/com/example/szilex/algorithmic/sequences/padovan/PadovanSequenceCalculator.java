package com.example.szilex.algorithmic.sequences.padovan;

import java.math.BigInteger;

/**
 * Class for operating on Padovan sequence, in which n-th value is calculated as P(n)=P(n-2)+P(n-3) and  initial values are P(0)=P(1)=P(2)=1
 */
public class PadovanSequenceCalculator {

    public static void main(String[] args) {
        System.out.println(getPadovanValue(1000000));
    }

    public static BigInteger getPadovanValue(long n) {
        if (n==0 || n==1 || n==2) {
            return BigInteger.ONE;
        }

        BigInteger[][] padovanMatrix = new BigInteger[][] {
            {BigInteger.ZERO, BigInteger.ONE, BigInteger.ZERO},
            {BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE},
            {BigInteger.ONE, BigInteger.ONE, BigInteger.ZERO}
        };

        BigInteger[][] resultPadovanMatrix = matrixPow(padovanMatrix, n + 1);

        return resultPadovanMatrix[2][1];
    }

    private static BigInteger[][] matrixPow(BigInteger[][] matrix, long exponent) {
        if (exponent == 1) return matrix;

        BigInteger[][] squaredMatrix = matrixMul(matrix, matrix);

        if (exponent % 2 == 0) {
            return matrixPow(squaredMatrix, exponent / 2);
        } else {
            return matrixMul(matrix, matrixPow(squaredMatrix, (long) Math.floor((exponent / 2.0))));
        }
    }

    /**
     * Function for multiplying two BigInteger matrices of size n*n
     * @param matrix1 Square matrix of size n*n
     * @param matrix2 Square matrix of size n*n
     * @return Result matrix of multiplied matrices
     */
    private static BigInteger[][] matrixMul(BigInteger[][] matrix1, BigInteger[][] matrix2) {
        int n = matrix1.length;
        BigInteger[][] result = new BigInteger[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = BigInteger.ZERO;
                for (int k = 0; k < n; k++) {
                    result[i][j] = result[i][j].add(matrix1[i][k].multiply(matrix2[k][j]));
                }
            }
        }

        return result;
    }
}
