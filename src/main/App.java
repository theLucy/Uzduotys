package main;

public class App {
    public static void main(String[] args) {
        System.out.println(titleToNumber("A")); // Expected 1
        System.out.println(titleToNumber("AB")); // Expected 28
        System.out.println(titleToNumber("ZY")); // Expected 701
    }

    public static int titleToNumber(String columnTitle) {
        int n = columnTitle.length() - 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            int digit = columnTitle.charAt(n - i) - 'A' + 1;
            sum += digit * Math.pow(26, i);
        }
        return sum;
    }
}