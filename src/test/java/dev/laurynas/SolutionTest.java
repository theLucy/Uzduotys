package dev.laurynas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    static Solution sol;

    @BeforeAll
    static void init() {
        sol = new Solution();
    }

    @Test
    void numberTwentySevenShouldReturnTrue() {
        assertTrue(sol.isPowerOfThree(27));
    }

    @Test
    void numberZeroShouldReturnFalse() {
        assertFalse(sol.isPowerOfThree(0));
    }

    @Test
    void numberMinus1ShouldReturnFalse() {
        assertFalse(sol.isPowerOfThree(-1));
    }
}