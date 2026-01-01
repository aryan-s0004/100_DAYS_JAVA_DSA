package Sliding_Window;

public class Problem_01 {

    /**
     * Returns the maximum sum of any contiguous subarray of size k = 2
     * using the fixed-size sliding window technique.
     */
    public static void maxSumOfSubarraySize2(int[] arr) {

        int k = 2;                          // Fixed window size
        int n = arr.length;                // Length of array

        // Initial window sum (first k elements)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;             // Stores maximum sum found so far
        int left = 0;                       // Left pointer of window

        // Slide the window across the array
        for (int right = k; right < n; right++) {
            windowSum = windowSum - arr[left] + arr[right]; // Update window sum
            left++;                                         // Move window forward

            if (windowSum > maxSum) {
                maxSum = windowSum;                          // Update max sum
            }
        }

        System.out.println("Maximum subarray sum (k=2) = " + maxSum);
    }

    // Main method (program entry point)
    public static void main(String[] args) {

        System.out.println("WELCOME BACK");
        System.out.println("WAP to return max sum of subarray of size k = 2");

        int[] arr = {-781, -2, -3, -6};
        maxSumOfSubarraySize2(arr);
    }
}
