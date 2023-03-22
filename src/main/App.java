package main;

public class App {
    public static void main(String[] args) {
        System.out.println(convertToTitle(1)); // Expected "A
        System.out.println(convertToTitle(28)); // Expected "AB"
        System.out.println(convertToTitle(701)); // Expected "ZY"
    }

    public static String convertToTitle(int i) {
        i--;
        int quot = i / 26;
        int rem = i % 26;
        char letter = (char) ((int) 'A' + rem);
        if (quot == 0) {
            return "" + letter;
        } else {
            return convertToTitle(quot) + letter;
        }
    }

    /* Alternative solution (Needs fixing!!) */
    public static String convertToTitle2(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        char[] digits = {'.', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
                'K', 'L', 'M', 'N', 'O', 'P', 'R', 'S', 'T', 'U',
                'V', 'W', 'X', 'Y', 'Z'};
        int n = 26;
        while (columnNumber > 0) {
            sb.append(digits[columnNumber % n]);
            columnNumber /= n;
        }
        return sb.reverse().toString();
    }
}