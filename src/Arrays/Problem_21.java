package Arrays;

public class Problem_21 {

    // Finds the maximum pile size to set upper bound of binary search
    public static int findMax(int[] piles) {
        int max = piles[0];
        for (int i = 1; i < piles.length; i++) {
            if (piles[i] > max) {
                max = piles[i];
            }
        }
        return max;
    }

    // Calculates total hours required to eat all piles at given speed
    public static long calculateTime(int[] piles, int speed) {
        long totalTime = 0;
        for (int i = 0; i < piles.length; i++) {
            // Ceiling division: ensures partial eating still takes 1 full hour
            totalTime += (piles[i] + speed - 1) / speed;
        }
        return totalTime;
    }

    // Returns minimum speed at which Koko can eat all bananas within h hours
    public static int minEatingSpeed(int[] piles, int h) {

        // If hours are less than number of piles, it is impossible
        // Because one pile needs at least one hour
        if (h < piles.length) {
            return -1;
        }

        int left = 1;                 // Minimum possible eating speed
        int right = findMax(piles);   // Maximum speed needed (eat largest pile in 1 hour)
        int ans = right;              // Stores best valid answer

        // Binary search to find minimum valid speed
        while (left <= right) {
            int mid = left + (right - left) / 2; // Prevents overflow

            long totalTime = calculateTime(piles, mid);

            // If Koko can finish within h hours, try smaller speed
            if (totalTime <= h) {
                ans = mid;
                right = mid - 1;
            }
            // Otherwise, speed is too slow, increase it
            else {
                left = mid + 1;
            }
        }

        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {

        int[] piles = {3, 6, 7, 11};
        int h = 20;

        int result = minEatingSpeed(piles, h);

        if (result == -1) {
            System.out.println("Not possible to eat all piles in given hours.");
        } else {
            System.out.println("Minimum Eating Speed: " + result);
        }
    }
}






