package dev.laurynas;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionTest {

    static Solution sol;

    @BeforeAll
    static void prepare() {
        sol = new Solution();
    }

    @Test
    void stringOneShouldReturnTrue() {
        assertTrue(sol.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void stringTwoShouldReturnFalse() {
        assertFalse(sol.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void stringThreeShouldReturnFalse() {
        assertFalse(sol.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    void stringFourShouldReturnFalse() {
        assertFalse(sol.wordPattern("abba", "dog dog dog dog"));
    }

}