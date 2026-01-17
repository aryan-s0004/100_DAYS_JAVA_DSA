package Sliding_Window;

public class Problem_01 {

    /**
     * Returns the maximum sum of any contiguous subarray of size k
     * using the Fixed Size Sliding Window technique.
     */
    public static int maxSumSubarray(int[] arr, int k) {

        int n = arr.length;

        // Step 0: Edge case check
        if (n < k) {
            return -1;   // Not enough elements to form window
        }

        // Step 1: Calculate sum of first window (size k)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int maxSum = windowSum;   // Store best result
        int left = 0;             // Left pointer of window

        // Step 2: Slide the window
        for (int right = k; right < n; right++) {

            // Remove left element + add new right element
            windowSum = windowSum - arr[left] + arr[right];

            // Move window forward
            left++;

            // Update answer
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }

        return maxSum;
    }

    // Main method (entry point)
    public static void main(String[] args) {

        int[] arr = {-7, -2, -3, -6, 7, 9};
        int k = 2;

        int result = maxSumSubarray(arr, k);
        System.out.println("Maximum subarray sum of size " + k + " = " + result);
    }
}
