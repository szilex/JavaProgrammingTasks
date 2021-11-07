package com.example.szilex.algorithmic.generators;

import java.util.TreeMap;

public class HammingNumberGenerator {

    private enum NodeType {
        LEFT,
        MIDDLE,
        RIGHT
    }

    /**
     * Function for calculating n-th lowest Hamming number, which are calculated as 2^i*3^j*5^k, where i,j,k can be any non-negative integer
     * @param n Index of the desired lowest Hamming number
     * @return n-th lowest Hamming number
     */
    public static long generateHammingNumber(int n) {
        TreeMap<Long, NodeType> valuesSortedMap = new TreeMap<>();
        valuesSortedMap.put(1L, NodeType.LEFT);
        valuesSortedMap.put(2L, NodeType.MIDDLE);
        valuesSortedMap.put(3L, NodeType.RIGHT);
        while (n > 1) {
            n--;
            var entry = valuesSortedMap.firstEntry();
            valuesSortedMap.remove(entry.getKey());
            switch (entry.getValue()) {
                case LEFT: {
                    valuesSortedMap.put(entry.getKey() * 2, NodeType.LEFT);
                    valuesSortedMap.put(entry.getKey() * 3, NodeType.MIDDLE);
                    valuesSortedMap.put(entry.getKey() * 5, NodeType.RIGHT);
                    break;
                }
                case MIDDLE: {
                    valuesSortedMap.put(entry.getKey() * 3, NodeType.MIDDLE);
                    valuesSortedMap.put(entry.getKey() * 5, NodeType.RIGHT);
                    break;
                }
                case RIGHT: {
                    valuesSortedMap.put(entry.getKey() * 5, NodeType.LEFT);
                    break;
                }
            }
        }
        return valuesSortedMap.firstKey();
    }
}
