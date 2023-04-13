package dev.laurynas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test1() {
        Solution sol = new Solution(6);
        assertEquals(6, sol.guessNumber(10));
    }

    @Test
    void test2() {
        Solution sol = new Solution(1);
        assertEquals(1, sol.guessNumber(1));
    }

    @Test
    void test3() {
        Solution sol = new Solution(1);
        assertEquals(1, sol.guessNumber(2));
    }
}