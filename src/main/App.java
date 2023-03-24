package main;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 1})); // Expected true
        System.out.println(sol.containsDuplicate(new int[]{1, 2, 3, 4})); // Expected false
        System.out.println(sol.containsDuplicate(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2})); // Expected true
    }
}