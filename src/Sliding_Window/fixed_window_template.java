package Sliding_Window;

public class fixed_window_template {

    /*
     * FIXED SIZE SLIDING WINDOW TEMPLATE
     * --------------------------------
     * Use when:
     *  - Subarray size is FIXED (k given)
     *  - Contiguous elements required
     *  - Problems: max / min / avg / sum / count
     *
     * Time Complexity: O(n)
     * Space Complexity: O(1)
     *
     * RULE:
     * Window logic NEVER changes
     * Result logic ALWAYS changes
     */

    public static int fixedWindow(int[] arr, int k) {

        int n = arr.length;

        // ❌ Edge case: window cannot be formed
        if (n < k) return -1;

        // 1️⃣ Build first window (0 to k-1)
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // 2️⃣ Initialize result (CHANGE BASED ON QUESTION)
        int result = windowSum; // maxSum / minSum / totalSum etc.

        int left = 0; // left pointer of window

        // 3️⃣ Slide the window (k to n-1)
        for (int right = k; right < n; right++) {

            // Remove outgoing element + add incoming element
            windowSum = windowSum - arr[left] + arr[right];
            left++;

            // 4️⃣ RESULT LOGIC (ONLY THIS PART CHANGES)
            // ------------------------------------------------
            // Max sum    → result = Math.max(result, windowSum);
            // Min sum    → result = Math.min(result, windowSum);
            // Total sum  → result += windowSum;
            // Avg        → print (double) windowSum / k;
            // Count      → result = n - k + 1;
            // ------------------------------------------------
        }

        return result;
    }
}
