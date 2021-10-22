package com.example.szilex.algorithmic.matrices;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MatrixUtilsTests {

    @Test
    void testSingleElementMatrix() {
        int[][] matrix = new int[][] {{1}};
        Assertions.assertEquals(1, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }

    @Test
    void testTwoByTwoElementMatrix() {
        int[][] matrix = new int[][] {{1, 2}, {3, 4}};
        Assertions.assertEquals(-2, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }

    @Test
    void testThreeByThreeElementMatrix() {
        int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        Assertions.assertEquals(0, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }

    @Test
    void testThreeByThreeNegativeElementMatrix() {
        int[][] matrix = new int[][] {{1, -2, -3}, {-4, -5, 6}, {7, -8, 9}};
        Assertions.assertEquals(-354, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }

    @Test
    void testThreeByThreeDiagonalMatrix() {
        int[][] matrix = new int[][] {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        Assertions.assertEquals(1, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }

    @Test
    void testFiveByFiveElementMatrix() {
        int[][] matrix = new int[][] {{1, 2, 3, 4, 5}, {7, 9, 3, 2, 3}, {6, 2, 8, 4, 7}, {3, 1, 8, 4, 5}, {6, 3, 5, 3, 1}};
        Assertions.assertEquals(-1959, MatrixUtils.calculateSquareMatrixDeterminant(matrix));
    }
}
