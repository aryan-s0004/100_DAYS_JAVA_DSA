package Sliding_Window;

public class Problem_02 {

    /*
     * Fixed Size Sliding Window
     *
     * NOTE (IMPORTANT):
     * - Window creation and movement logic NEVER changes
     * - Only the result logic changes (max / min / avg / count)
     */

    public static int minSumSubarray(int[] arr, int k) {

        int n = arr.length;

        // Edge case: window cannot be formed
        if (n < k) return -1;

        // Step 1: Build the first window (size k)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        /*
         * RESULT VARIABLE
         * Change here based on question:
         * - Max sum   → int maxSum = windowSum;
         * - Min sum   → int minSum = windowSum;
         * - Avg       → use windowSum, divide by k
         * - Count     → use counter, ignore sum comparison
         */
        int minSum = windowSum;

        int left = 0;   // Left boundary of window

        // Step 2: Slide the window
        for (int right = k; right < n; right++) {

            // Update window sum:
            // remove outgoing element, add incoming element
            windowSum = windowSum - arr[left] + arr[right];
            left++;

            /*
             * RESULT LOGIC (ONLY PART THAT CHANGES)
             *
             * Min sum:
             * if (windowSum < minSum) minSum = windowSum;
             *
             * Max sum:
             * if (windowSum > maxSum) maxSum = windowSum;
             *
             * Avg:
             * avg = windowSum / k;
             *
             * Count:
             * count++;
             */
            if (windowSum < minSum) {
                minSum = windowSum;
            }
        }

        return minSum;
    }

    public static void main(String[] args) {

        int[] arr = {-7, -2, -3, -6, 7, 9};
        int k = 3;

        int result = minSumSubarray(arr, k);
        System.out.println("Minimum subarray sum of size " + k + " = " + result);
    }
}
