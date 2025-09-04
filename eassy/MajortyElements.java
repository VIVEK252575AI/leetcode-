package eassy;
import java.util.HashMap;

public class MajortyElements {
    
    public static void majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        
        // Count frequency of each element
        for(int i = 0; i < n; i++) {
            if(map.containsKey(nums[i])) { // true
                map.put(nums[i], map.get(nums[i]) + 1);
            } else { // false
                map.put(nums[i], 1);
            }
        }
        
        // Find elements with frequency > n/3
        for(int key : map.keySet()) {
            if(map.get(key) > n/3) {
                System.out.println(key);
            }
        }
    }
    
    public static void main(String[] args) { // O(n)
        int[] nums = {1, 3, 2, 5, 1, 3, 1, 5, 1}; // Input array
        majorityElement(nums);
    }
}
