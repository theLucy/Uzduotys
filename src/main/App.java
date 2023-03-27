package main;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.isAnagram("anagram", "nagaram"); // Expected true
        System.out.println("***");
        sol.isAnagram("rat", "car"); // Expected false
        System.out.println("***");
        sol.isAnagram("aac", "cac"); // Expected false
    }
}