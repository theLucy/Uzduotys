package main;

public class App {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.summaryRanges(new int[]{0, 1, 2, 4, 5, 7}));
        System.out.println(sol.summaryRanges(new int[]{0, 2, 3, 4, 6, 8, 9}));
        System.out.println(sol.summaryRanges(new int[]{}));
        System.out.println(sol.summaryRanges(new int[]{0}));
        System.out.println(sol.summaryRanges(new int[]{0, 1}));
        System.out.println(sol.summaryRanges(new int[]{0, 2}));
        System.out.println(sol.summaryRanges(new int[]{0, 2, 4}));
        System.out.println(sol.summaryRanges(new int[]{0, 2, 3}));
        System.out.println(sol.summaryRanges(new int[]{0, 1, 3}));
    }
}