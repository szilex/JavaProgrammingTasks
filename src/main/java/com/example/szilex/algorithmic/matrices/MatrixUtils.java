package com.example.szilex.algorithmic.matrices;

public class MatrixUtils {
    public static int calculateSquareMatrixDeterminant(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int i = 0; i < matrix.length; i++) {
                //TODO Add logic for extracting sub-matrices and calculate their determinant
            }
        }

        return 0;
    }
}
