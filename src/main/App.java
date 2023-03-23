package main;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.isIsomorphic("egg", "add")); // Expected true
        System.out.println(sol.isIsomorphic("foo", "bar")); // Expected false
        System.out.println(sol.isIsomorphic("paper", "title")); // Expected true
    }
}