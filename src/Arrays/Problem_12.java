package Arrays;

public class Problem_12 {

    // Binary Search to find floor(sqrt(num))
    // f(x) = x*x is monotonically increasing
    // If mid*mid < num → move right
    // If mid*mid > num → move left
    // Search space is [1 ... num]
    // ans stores the best possible floor value

    public static int sqrt_num(int num) {

        int l = 1;          // left boundary
        int r = num;        // right boundary
        int ans = -1;       // stores floor square root

        while (l <= r) {

            int mid = l + (r - l) / 2; // safe mid calculation
            int sq = mid * mid;

            if (sq == num) {
                return mid;            // perfect square
            } else if (sq < num) {
                ans = mid;             // possible answer
                l = mid + 1;           // move right
            } else {
                r = mid - 1;           // move left
            }
        }

        return ans; // floor(sqrt(num))
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("Find square root of number:");

        int key = 50;
        int res = sqrt_num(key);

        System.out.println("Result is: " + res); // floor sqrt of 50 is 7
    }
}
