/* Given an array of integers nums and an integer target,
return indices of the two numbers such that they add up to target.
You may assume that each input would have exactly one solution,
and you may not use the same element twice.
You can return the answer in any order.
Constraints (i.e. guaranteed):
- 2 <= nums.length <= 10^4
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- Only one valid answer exists.
Follow-up: Can you come up with an algorithm that is less than O(n^2) time complexity?
*/

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        // Create array for returning the result
        int[] result = new int[2];

        // Create map for storing pairs of indexes and differences
        Map <Integer, Integer> pairs = new HashMap<>();

        // Single pass
        for (int i = 0; i < nums.length; i++) {
            Integer dif = target - nums[i];
            // Check if the difference is already in the map and it's value != i
            if (pairs.containsKey(dif) && i != pairs.get(dif)) {
                // Populate the indexes into resulting array
                result[0] = i;
                result[1] = pairs.get(dif);
                break; // no need to continue since there's only one valid answer
            }
            // If not, add the element and its index to the map
            pairs.put(nums[i], i);
        }

        // Total complexity O(n)
        return result;
    }

    public static void main(String[] args) {
        TwoSum twosum = new TwoSum();
        // Corner case
        int[] nums = {3, 3}; 
        int target = 6;
        int[] res = twosum.twoSum(nums, target);
        System.out.println("Result: " + res[0] + ", " + res[1]);
    }
}
