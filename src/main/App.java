package main;

public class App {
    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println(lengthOfLastWord(s1)); // Expected: 5
        System.out.println(lengthOfLastWord(s2)); // Expected: 4
        System.out.println(lengthOfLastWord(s3)); // Expected: 6
    }

    public static int lengthOfLastWord(String s) {
        s = s.strip();
        return s.substring(s.lastIndexOf(" ") + 1)
                .length();
    }
}