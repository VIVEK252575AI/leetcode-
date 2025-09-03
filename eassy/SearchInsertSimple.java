// Problem 35: Search Insert Position
package eassy;
public class SearchInsertSimple {
    public int searchInsert(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return start;
    }
    
    // Test
    public static void main(String[] args) {
        SearchInsertSimple solution = new SearchInsertSimple();
        int[] nums = {1, 3, 5, 6};
        
        System.out.println(solution.searchInsert(nums, 5)); // Output: 2
        System.out.println(solution.searchInsert(nums, 2)); // Output: 1
        System.out.println(solution.searchInsert(nums, 7)); // Output: 4
        System.out.println(solution.searchInsert(nums, 0)); // Output: 0
    }
}