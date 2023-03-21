package main;

public class App {
    public static void main(String[] args) {
        System.out.println(addBinary("11", "1")); // Expected "100"
        System.out.println(addBinary("1010", "1011")); //Expected "10101"
    }

    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;

        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry == 1) {
            if (i >= 0) carry += a.charAt(i) - '0';
            if (j >= 0) carry += b.charAt(j) - '0';

            sb.append(carry % 2);
            carry = carry / 2;

            i--;
            j--;
        }

        return sb.reverse().toString();
    }
}