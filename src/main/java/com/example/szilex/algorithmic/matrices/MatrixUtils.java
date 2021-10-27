package com.example.szilex.algorithmic.matrices;

public class MatrixUtils {
    public static int calculateSquareMatrixDeterminant(int[][] matrix) {
        if (matrix.length == 1) {
            return matrix[0][0];
        } else if (matrix.length == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            int result = 0;
            for (int i = 0; i < matrix.length; i++) {
                int[][] subArray = new int[matrix.length - 1][matrix.length - 1];
                for (int matrixRowIndex = 1, subArrayRowIndex=0; matrixRowIndex < matrix.length; matrixRowIndex++, subArrayRowIndex++) {
                    for (int matrixColumnIndex = 0, subArrayColumnIndex = 0; matrixColumnIndex < matrix.length; matrixColumnIndex++, subArrayColumnIndex++) {
                        if (matrixColumnIndex != i) {
                            subArray[subArrayRowIndex][subArrayColumnIndex] = matrix[matrixRowIndex][matrixColumnIndex];
                        } else {
                            subArrayColumnIndex--;
                        }
                    }
                }
                result += (i % 2 == 0 ? 1 : -1) * matrix[0][i] * calculateSquareMatrixDeterminant(subArray);
            }
            return result;
        }
    }
}
