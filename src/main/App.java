package main;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 2, 3, 1}, 3)); // Expected true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 0, 1, 1}, 1)); // Expected true
        System.out.println(sol.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 2, 3}, 2)); // Expected false
    }
}