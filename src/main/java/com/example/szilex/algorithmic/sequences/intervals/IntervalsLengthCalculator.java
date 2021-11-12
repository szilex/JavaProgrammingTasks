package com.example.szilex.algorithmic.sequences.intervals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntervalsLengthCalculator {
    public static int calculateTotalIntervalsLength(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        List<int[]> intervalsList = Arrays.asList(intervals);
        List<int[]> simplifiedIntervals = simplifyIntervals(intervalsList);

        return totalIntervalsLength(simplifiedIntervals);
    }

    private static List<int[]> simplifyIntervals(List<int[]> intervals) {
        ArrayList<int[]> intervalsCopy = new ArrayList<>(intervals);
        intervalsCopy.sort(Comparator.comparingInt(array -> array[0]));

        ArrayList<int[]> result = new ArrayList<>();
        result.add(intervalsCopy.get(0));
        intervalsCopy.remove(0);

        for (var interval : intervalsCopy) {
            int[] lastResultInterval = result.get(result.size() - 1);
            if (lastResultInterval[1] > interval[0]) {
                if (lastResultInterval[1] < interval[1]) {
                    lastResultInterval[1] = interval[1];
                }
            } else if (lastResultInterval[1] == interval[0]) {
                lastResultInterval[1] = interval[1];
            } else {
                result.add(interval);
            }
        }

        return result;
    }

    private static int totalIntervalsLength(List<int[]> intervals) {
        return intervals.stream().mapToInt(interval -> interval[1] - interval[0]).sum();
    }
}
