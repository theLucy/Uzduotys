package dev.laurynas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void test1() {
        NumArray num = new NumArray(new Integer[]{-2, 0, 3, -5, 2, -1});
        assertEquals(1, num.sumRange(0, 2));
        assertEquals(-1, num.sumRange(2, 5));
        assertEquals(-3, num.sumRange(0, 5));
    }
}