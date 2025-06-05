/*
 * Write a function to find the longest common prefix string amongst an array of strings.
 * If there is no common prefix, return an empty string "".
 * 
 * Constraints:
 * - 1 <= strs.length <= 200
 * - 0 <= strs[i].length <= 200
 * - strs[i] consists of only lowercase English letters if it is non-empty.
 */

public class LongestCommonPrefix {

    // LeetCode solution, the simplest one
    public String longestCommonPrefix(String[] strs) {
        // Corner case
        if (strs.length == 0) {
            return "";
        }
        // Let the first string be initial result
        String result = strs[0];

        // Iterate over array of strings starting from 2nd
        for (int i = 1; i < strs.length; i++) {
            // Run until substring result is located at start of strs[i]
            while (strs[i].indexOf(result) != 0) { // returns index of first occurrence of result within strs[i]
                // Reduce the substring length by 1 from the end
                result = result.substring(0, result.length()-1);
                // Once result is empty, we know there's no common prefix
                if (result.isEmpty()) {
                    return "";
                }
            }        
        }

        return result;
    }
}
