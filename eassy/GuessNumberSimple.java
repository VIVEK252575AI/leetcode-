// Problem 374: Guess Number Higher or Lower
// Mock class for VS Code testing
package eassy;
abstract class GuessGame {
    private int picked = 6; // Change this to test different scenarios
    protected int guess(int num) {
        if (num > picked) return -1;      // Too high
        else if (num < picked) return 1;  // Too low
        else return 0;                    // Correct
    }
}

public class GuessNumberSimple extends GuessGame {
    public int guessNumber(int n) {
        int start = 1, end = n;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int result = guess(mid);
            
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
    
    // Test
    public static void main(String[] args) {
        GuessNumberSimple solution = new GuessNumberSimple();
        System.out.println(solution.guessNumber(10)); // Output: 6
    }
}