package dev.laurynas;

public class Solution {

    int pick;

    public Solution(int pick) {
        this.pick = pick;
    }

    public int guessNumber(int n) {
        return guessNumberIter(n); // Iterative approach
        //return guessNumberRec(n, 1, n); // Recursive approach
    }

    public int guessNumberIter(int n) {
        int low = 1;
        int high = n;
        int mid = 0;

        while (low <= high) {
            mid = low + (high - low) / 2;
            if (guess(mid) == 1)
                low = mid + 1;
            else if (guess(mid) == -1)
                high = mid - 1;
            else
                return mid;
        }
        return -1;
    }

    public int guessNumberRec(int n, int low, int high) {
        int mid = low + (high - low) / 2;
        if (guess(mid) == 1) {
            return guessNumberRec(n, mid + 1, high);
        } else if (guess(mid) == -1) {
            return guessNumberRec(n, low, mid - 1);
        } else {
            return mid;
        }
    }

    private int guess(int n) {
        return Integer.compare(pick, n);
    }
}
