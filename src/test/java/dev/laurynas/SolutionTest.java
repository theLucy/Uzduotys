package dev.laurynas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();
    @Test
    void thirdyEightShouldReturnTwo() {
        assertEquals(2, sol.addDigits(38));
    }

    @Test
    void zeroShouldReturnZero() {
        assertEquals(0, sol.addDigits(0));
    }
}