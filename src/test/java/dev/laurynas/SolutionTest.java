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
    void sixteenShouldReturnTrue() {
        assertTrue(sol.isPerfectSquare(16));
    }

    @Test
    void fourteenShouldReturnFalse() {
        assertFalse(sol.isPerfectSquare(14));
    }

    @Test
    void bigNumberShouldReturnSmth() {
        assertFalse(sol.isPerfectSquare(2147483647));
    }
}