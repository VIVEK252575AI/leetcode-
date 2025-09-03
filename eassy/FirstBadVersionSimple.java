// Problem 278: First Bad Version
// Mock class for VS Code testing
package eassy;
abstract class VersionControl {
    private int firstBad = 4; // Change this to test different scenarios
    protected boolean isBadVersion(int version) {
        return version >= firstBad;
    }
}

public class FirstBadVersionSimple extends VersionControl {
    public int firstBadVersion(int n) {
        int start = 1, end = n, ans = -1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            if (isBadVersion(mid)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }
    
    // Test
    public static void main(String[] args) {
        FirstBadVersionSimple solution = new FirstBadVersionSimple();
        System.out.println(solution.firstBadVersion(10)); // Output: 4
    }
}