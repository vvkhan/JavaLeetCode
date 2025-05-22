/*
 * Given an integer x, return true if x is a palindrome, and false otherwise.
 * Constraints:
 * - -2^31 <= x <= 2^31 - 1
 * Follow up: Could you solve it without converting the integer to a string?
 */

import java.util.ArrayList;

public class Palindrome {
    public boolean isPalindrome(int x) {
        boolean result = false;
        // Negative int is not palindrome as well as int ending with 0, early return
        if (x < 0 || x % 10 == 0) {
            return result;
        }
        // Another corner case:
        if (x >= 0 && x < 10) {
            result = true;
            return result;
        }

        // Copy the input
        int copyX = x;

        // Empty array to store remainders
        ArrayList<Integer> arr = new ArrayList<>();

        // Turn digits of x into array of ints reversed:
        while (copyX >= 10) {
            arr.add(copyX % 10);
            copyX = copyX/10;
        }
        arr.add(copyX);

        int revX = 0;
        for (int i = 0; i < arr.size() - 1; i++) {
            revX = (revX + arr.get(i)) * 10;
        }
        revX += arr.get(arr.size()-1);

        // Final check
        if (x == revX) {
            result = true;
        }

        return result;
    }

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        int x = 123432;
        boolean res = palindrome.isPalindrome(x);
        System.out.println("Result: " + res);
    }
}
