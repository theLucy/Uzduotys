package main;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {

        int result = 0;

        char[] romanSymbols = {'M', 'D', 'C', 'L', 'X', 'V', 'I'};
        int ptr = 0;

        Map<Character, Integer> rToIntMap = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );


        for (int i = 0; i < romanSymbols.length && ptr < s.length();) {
            char r = romanSymbols[i];
            if (s.charAt(ptr) == r) {
                result += rToIntMap.get(r);
            } else {
                ptr--;
            }

            if((ptr+2) < s.length() && s.charAt(ptr+1) != r &&
                    s.charAt(ptr+2) == r) {
                result += rToIntMap.get(r) - rToIntMap.get(s.charAt(ptr+1));
                ptr += 3;
                i++;
            } else if((ptr+1) < s.length() && s.charAt(ptr+1) == r) {
                result += rToIntMap.get(r);
                ptr+=2;
            } else {
                i++;
                ptr++;
            }
        }




        return result;
    }
}