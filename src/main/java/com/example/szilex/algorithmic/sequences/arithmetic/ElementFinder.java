package com.example.szilex.algorithmic.sequences.arithmetic;

/**
 * Class aggregating various functions for calculating elements in a given arithmetic sequence
 */
public class ElementFinder {

    /**
     * Function for calculating element on n-th position (index) in an infinite sequence 112123123412345... created from sequence [1, 12, 123, 1234, 12345, ...]
     * Note: After number 9 is added at the end, the next added value is 10, when 99 is added, then next element is 100 etc.
     * @param n Index of the desired element, 0 <= n <= 10^18
     * @return Element at given index
     */
    public static int findElementInCombinedSequence(long n) {

        int range = 0;
        long totalSequenceLength = 0;
        long previousTotalSequenceLength = 0;
        long firstAddedElement;
        long lastAddedElement;
        long currentRangeElementCount;
        final long maxIndex = (long) Math.pow(10, 18);

        while (totalSequenceLength < n && totalSequenceLength < maxIndex) {
            range++;
            firstAddedElement = (long) Math.pow(10, range - 1);
            lastAddedElement = (long) Math.pow(10, range) - 1;
            currentRangeElementCount = 9 * firstAddedElement;
            previousTotalSequenceLength = totalSequenceLength;
            totalSequenceLength += totalSequenceLength * currentRangeElementCount + (firstAddedElement + lastAddedElement) * currentRangeElementCount / 2;
        }

        long currentElementLength = 0;

        for (int i = 1; i < range; i++) {
            currentElementLength +=  9 * (long) Math.pow(10, i - 1);
        }

        currentElementLength += range;

        while (previousTotalSequenceLength + currentElementLength < n) {
            previousTotalSequenceLength += currentElementLength;
            currentElementLength += range;
        }

        long currentSequenceElementTargetNumberOffset = n - previousTotalSequenceLength;
        long currentSequenceElementPreviousRangesNumberCount = 0;
        int currentSequenceElementTargetNumberRange = 1;

        for (int i = 1; i <= range; i++) {
            long currentRangeTotalElementsLength = 9 * (long) Math.pow(10, i-1) * i;
            if (currentSequenceElementPreviousRangesNumberCount + currentRangeTotalElementsLength >= currentSequenceElementTargetNumberOffset) {
                currentSequenceElementTargetNumberRange = i;
                currentSequenceElementTargetNumberOffset -= currentSequenceElementPreviousRangesNumberCount;
                break;
            } else {
                currentSequenceElementPreviousRangesNumberCount += currentRangeTotalElementsLength;
            }
        }

        int currentSequenceElementValuesBeforeTargetValueCount = (int) (currentSequenceElementTargetNumberOffset - 1) / currentSequenceElementTargetNumberRange;
        int currentSequenceElementTargetNumber = (int) Math.pow(10, currentSequenceElementTargetNumberRange - 1) + currentSequenceElementValuesBeforeTargetValueCount;
        currentSequenceElementTargetNumberOffset -= (long) currentSequenceElementValuesBeforeTargetValueCount * currentSequenceElementTargetNumberRange;

        return Character.getNumericValue(String.valueOf(currentSequenceElementTargetNumber).charAt((int)currentSequenceElementTargetNumberOffset - 1));
    }
}
