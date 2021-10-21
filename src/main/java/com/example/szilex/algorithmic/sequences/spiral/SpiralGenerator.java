package com.example.szilex.algorithmic.sequences.spiral;

public class SpiralGenerator {

    private enum SpiralDirection {
        RIGHT,
        DOWN,
        LEFT,
        UP
    }

    public static int[][] getSpiral(int n) {
        if (n < 5) {
            throw new IllegalArgumentException("Incorrect spiral size: " + n);
        }

        int[][] result = new int[n][n];
        int rowIndex = 0, columnIndex = 0;
        int rowIndexLowerBound = 2, columnIndexLowerBound = 0;
        int rowIndexUpperBound = n - 1, columnIndexUpperBound = n - 1;
        boolean isSpiralFinished = false;
        SpiralDirection currentDirection = SpiralDirection.RIGHT;

        while(!isSpiralFinished) {
            result[rowIndex][columnIndex] = 1;
            switch (currentDirection) {
                case RIGHT:
                    if (columnIndex == columnIndexUpperBound) {
                        currentDirection = SpiralDirection.DOWN;
                        rowIndex++;
                        columnIndexUpperBound -= 2;
                    } else {
                        columnIndex++;
                    }
                    break;
                case DOWN:
                    if (rowIndex == rowIndexUpperBound) {
                        currentDirection = SpiralDirection.LEFT;
                        columnIndex--;
                        rowIndexUpperBound -= 2;
                    } else {
                        rowIndex++;
                    }
                    break;
                case LEFT:
                    if (columnIndex == columnIndexLowerBound) {
                        currentDirection = SpiralDirection.UP;
                        rowIndex--;
                        columnIndexLowerBound += 2;
                    } else {
                        columnIndex--;
                    }
                    break;
                case UP:
                    if (rowIndex == rowIndexLowerBound) {
                        currentDirection = SpiralDirection.RIGHT;
                        columnIndex++;
                        rowIndexLowerBound += 2;
                    } else {
                        rowIndex--;
                    }
                    break;
            }
            if (columnIndexLowerBound > columnIndexUpperBound && rowIndexLowerBound > rowIndexUpperBound) {
                if (n % 2 == 0) {
                    result[rowIndex][columnIndex] = 1;
                }
                isSpiralFinished = true;
            }
        }
        return result;
    }
}
