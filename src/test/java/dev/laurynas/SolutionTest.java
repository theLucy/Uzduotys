package dev.laurynas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution sol = new Solution();

    @Test
    void sixShouldReturnTrue() {
        assertTrue(sol.isUgly(6));
    }

    @Test
    void oneShouldReturnTrue() {
        assertTrue(sol.isUgly(1));
    }

    @Test
    void fourteenShouldReturnFalse() {
        assertFalse(sol.isUgly(14));
    }

    @Test
    void number540124044ShouldReturnFalse() {
        assertFalse(sol.isUgly(540124044));
    }

}