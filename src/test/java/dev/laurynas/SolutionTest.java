package dev.laurynas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {
    static Solution sol = new Solution();

    @Test
    void test1() {
        assertFalse(sol.canConstruct("a", "b"));
    }

    @Test
    void test2() {
        assertFalse(sol.canConstruct("aa", "ab"));
    }

    @Test
    void test3() {
        assertTrue(sol.canConstruct("aa", "aab"));
    }
}