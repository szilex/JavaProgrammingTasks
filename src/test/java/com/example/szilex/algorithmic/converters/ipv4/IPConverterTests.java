package com.example.szilex.algorithmic.converters.ipv4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IPConverterTests {

    @Test
    void testLocalHostIP() {
        assertEquals("127.0.0.1", IPConverter.parseLongValue(2130706433L));
    }

    @Test
    void testIPWithFourSegments() {
        assertEquals("128.114.17.104", IPConverter.parseLongValue(2154959208L));
    }

    @Test
    void testIPWithValueOnlyInFirstSegment() {
        assertEquals("234.0.0.0", IPConverter.parseLongValue(3925868544L));
    }

    @Test
    void testIPWithValueOnlyInLastSegment() {
        assertEquals("0.0.0.79", IPConverter.parseLongValue(79L));
    }

}
