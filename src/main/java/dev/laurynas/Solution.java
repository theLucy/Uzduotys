package dev.laurynas;

public class Solution {
    public int addDigits(int num) {
        return addDigitsRec(num);
    }

    public int addDigitsRec(int num) {
        int sum = 0;
        while (num > 0) {
            sum = sum + num % 10;
            num = num / 10;
        }
        sum = (sum < 10) ? sum : addDigits(sum);
        return sum;
    }

    public int addDigitsIter(int num) {
        while (num >= 10) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }
        return num;
    }

}
