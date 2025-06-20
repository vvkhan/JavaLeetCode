/*
 * Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
 * I = 1
 * V = 5
 * X = 10
 * L = 50
 * C = 100
 * D = 500
 * M = 1000
 * For example, 2 is written as II in Roman numeral, just two ones added together.
 * 12 is written as XII, which is simply X + II.
 * The number 27 is written as XXVII, which is XX + V + II.
 * Roman numerals are usually written largest to smallest from left to right.
 * However, the numeral for four is not IIII. Instead, the number four is written as IV.
 * Because the one is before the five we subtract it making four.
 * The same principle applies to the number nine, which is written as IX.
 * 
 * There are six instances where subtraction is used:
 * - I can be placed before V (5) and X (10) to make 4 and 9.
 * - X can be placed before L (50) and C (100) to make 40 and 90.
 * - C can be placed before D (500) and M (1000) to make 400 and 900.
 * Given a roman numeral, convert it to an integer.
 * 
 * Constraints:
 * - 1 <= s.length <= 15
 * - s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
 * - It is guaranteed that s is a valid roman numeral in the range [1, 3999].
 */

import java.util.Map;
import java.util.HashMap;

public class RomanToInteger {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray();

        Map <Character, Integer> pairs = new HashMap<>();
        pairs.put('I', 1);
        pairs.put('V', 5);
        pairs.put('X', 10);
        pairs.put('L', 50);
        pairs.put('C', 100);
        pairs.put('D', 500);
        pairs.put('M', 1000);

        int result = 0;

        for (int i = chars.length - 1; i >= 0; i--) {
            int num = pairs.get(chars[i]);

            if (i < chars.length - 1) {
                if ((chars[i] == 'I' && (chars[i+1] == 'V' || chars[i+1] == 'X')) || 
                    (chars[i] == 'X' && (chars[i+1] == 'L' || chars[i+1] == 'C')) || 
                    (chars[i] == 'C' && (chars[i+1] == 'D' || chars[i+1] == 'M'))) {
                    num = 0 - num;
                }
            }

            result += num;
        }

        return result;
    }

    public static void main(String[] args) {
        RomanToInteger romanToInt = new RomanToInteger();
        String s = "III";
        int res = romanToInt.romanToInt(s);
        System.out.println(res);
    }
}
