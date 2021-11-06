package com.example.szilex.algorithmic.sequences.arithmetic;

/**
 * Class aggregating various functions for calculating elements in a given arithmetic sequence
 */
public class ElementFinder {

    /**
     * Function for calculating element on n-th position (index) in an infinite sequence 112123123412345... created from sequence [1, 12, 123, 1234, 12345, ...]
     * Note: After number 9 is added at the end, the next added value is 10, when 99 is added, then next element is 100 etc.
     * @param n Index of the desired element, 0 <= n <= 10^18
     * @return Element at given index in the infinite sequence
     */
    public static int findElementInCombinedSequence(long n) {

        int range = 0;
        long previousTotalSequenceLength = 0;
        long previousRangesAllValuesLength;
        long currentRangesAllValuesLength = 0;
        final long maxIndex = (long) Math.pow(10, 18);

        // Find in which range (amount of numbers in the last value of sequence element) of values is the element with index x located.
        for (long totalSequenceLength = 0; totalSequenceLength < n && totalSequenceLength < maxIndex;) {
            range++;
            long currentRangeElementCount = 9 * (long) Math.pow(10, range - 1);
            previousRangesAllValuesLength = currentRangesAllValuesLength;
            currentRangesAllValuesLength += currentRangeElementCount * range;
            previousTotalSequenceLength = totalSequenceLength;
            totalSequenceLength += previousRangesAllValuesLength * currentRangeElementCount + (((range * (1 + currentRangeElementCount))) * currentRangeElementCount) / 2;
        }

        // Calculate length of the last element in previous range
        long previousRangeLastElementLength = 0;
        for (int i = 1; i < range; i++) {
            previousRangeLastElementLength +=  9 * (long) Math.pow(10, i - 1) * i;
        }

        // Find element in the target range of elements from the sequence that contains number on index n
        long nextElementLength = previousRangeLastElementLength + range;
        while (previousTotalSequenceLength + nextElementLength < n) {
            previousTotalSequenceLength += nextElementLength;
            nextElementLength += range;
        }

        // Find range of values in the target element that contains number on index n
        int targetSequenceElementTargetNumberRange = 1;
        long targetSequenceElementTargetNumberOffset = n - previousTotalSequenceLength - 1;
        long targetSequenceElementPreviousRangesTotalNumberCount = 0;
        for (int i = 1; i <= range; i++) {
            long currentRangeTotalValuesLength = 9 * (long) Math.pow(10, i-1) * i;
            if (targetSequenceElementPreviousRangesTotalNumberCount + currentRangeTotalValuesLength > targetSequenceElementTargetNumberOffset) {
                targetSequenceElementTargetNumberRange = i;
                targetSequenceElementTargetNumberOffset -= targetSequenceElementPreviousRangesTotalNumberCount;
                break;
            } else {
                targetSequenceElementPreviousRangesTotalNumberCount += currentRangeTotalValuesLength;
            }
        }

        // Find exact value in the target range of target element which contains number at index n
        int currentSequenceElementValuesBeforeTargetValueCount = (int) (targetSequenceElementTargetNumberOffset) / targetSequenceElementTargetNumberRange;
        int currentSequenceElementTargetNumber = (int) Math.pow(10, targetSequenceElementTargetNumberRange - 1) + currentSequenceElementValuesBeforeTargetValueCount;
        targetSequenceElementTargetNumberOffset -= (long) currentSequenceElementValuesBeforeTargetValueCount * targetSequenceElementTargetNumberRange;

        return Character.getNumericValue(String.valueOf(currentSequenceElementTargetNumber).charAt((int)targetSequenceElementTargetNumberOffset));
    }
}
