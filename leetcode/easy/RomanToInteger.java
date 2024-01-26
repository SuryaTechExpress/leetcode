package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
        String test1 = "III";
        String test2 = "LVIII";
        String test3 = "MCMXCIV";
        System.out.println(test1+" : "+romanToInt(test1));
        System.out.println(test2+" : "+romanToInt(test2));
        System.out.println(test3+" : "+romanToInt(test3));
    }

    public static int romanToInt(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            char currentChar = str.charAt(i);

            if (i < str.length() - 1 && map.get(currentChar) < map.get(str.charAt(i+1))) {
                result -= map.get(currentChar);
            } else {
                result += map.get(currentChar);
            }
        }
        return result;
    }
}
