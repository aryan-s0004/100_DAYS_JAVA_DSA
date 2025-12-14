package Arrays;

public class Problem_14 {

    // Find maximum subarray sum using Prefix Sum (O(n^2))
    public static void PrefixSum(int[] arr) {

        int n = arr.length;

        // Build prefix sum array
        int[] prefix = new int[n];
        prefix[0] = arr[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int maxSum = Integer.MIN_VALUE; // store maximum sum

        // Check all subarrays using prefix sums
        for (int start = 0; start < n; start++) {
            for (int end = start; end < n; end++) {

                // Calculate subarray sum
                int currSum = (start == 0)
                        ? prefix[end]
                        : prefix[end] - prefix[start - 1];

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("WAP to find max subarray sum : Approach 2 --> Prefix Sum");

        int[] arr = {30, -2, 5, -1};

        PrefixSum(arr);
    }
}
