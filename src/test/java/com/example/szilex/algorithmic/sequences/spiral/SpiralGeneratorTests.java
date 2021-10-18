package com.example.szilex.algorithmic.sequences.spiral;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SpiralGeneratorTests {

    @Test
    public void testGetSpiralSizeFive() {
        assertEquals(new int[][] {
                { 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 1 },
                { 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1 }
        }, SpiralGenerator.getSpiral(5));
    }

    @Test
    public void testGetSpiralSizeEight() {
        assertEquals(new int[][] {
                { 1, 1, 1, 1, 1, 1, 1, 1 },
                { 0, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 0, 0, 1, 0, 1 },
                { 1, 0, 1, 1, 1, 1, 0, 1 },
                { 1, 0, 0, 0, 0, 0, 0, 1 },
                { 1, 1, 1, 1, 1, 1, 1, 1 },
        }, SpiralGenerator.getSpiral(8));
    }

    @Test
    public void testGetSpiralSizeMinusTwo() {
        assertThrows(IllegalArgumentException.class, () -> SpiralGenerator.getSpiral(-2));
    }

    @Test
    public void testGetSpiralSizeThree() {
        assertThrows(IllegalArgumentException.class, () -> SpiralGenerator.getSpiral(3));
    }
}
