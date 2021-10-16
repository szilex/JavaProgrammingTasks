package com.example.szilex.algorithmic.converters.ipv4;

import java.util.Arrays;
import java.util.stream.Collectors;

public class IPConverter {
    public static String parseLongValue(long ip) {
        final int mask = 0b11111111;
        final int octetAmount = 4;
        final int byteSize = 8;
        final String[] octets = new String[octetAmount];
        for(int i = octetAmount - 1; i >= 0; i--){
            octets[octetAmount - i - 1] = String.valueOf((((long) mask << (byteSize * i)) & ip) >> (byteSize * i));
        }
        return Arrays.stream(octets)
                .map(Object::toString)
                .collect(Collectors.joining("."));
    }
}
