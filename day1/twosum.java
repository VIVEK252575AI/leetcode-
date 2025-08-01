
//this is the brute force approch  
package day1;
import java.util.*;

public class twosum {

    // Method to find indices of two numbers that add up to target
    public static int[] twoSum(int[] nums, int target) {
        // Try every pair (i, j), where i < j
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[] { i, j };
                }
            }
        }
        // If no result found (though problem guarantees a solution)
        return new int[] { -1, -1 };
    }

    // Main method to run in VS Code
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + Arrays.toString(result));
    }
}
