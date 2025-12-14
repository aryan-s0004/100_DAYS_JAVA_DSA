package Arrays;

public class Problem_13 {

    // Function 1: Print all subarrays with their sums (brute force)
    public static void printAllSubarrays(int[] arr) {

        int n = arr.length;            // array length
        int totalSubarrays = 0;        // total subarray count

        System.out.println("All Possible Subarrays:\n");

        // Fix starting index
        for (int start = 0; start < n; start++) {

            // Fix ending index
            for (int end = start; end < n; end++) {

                int currSum = 0;       // sum of current subarray

                // Print subarray elements
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    currSum += arr[k];
                }

                System.out.println(" -> Sum: " + currSum);
                totalSubarrays++;
            }

            System.out.println();      // line break
        }

        System.out.println("Total Subarrays = " + totalSubarrays);
    }

    // Function 2: Find maximum subarray sum (O(n^2))
    public static int getMaxSubarraySum(int[] arr) {

        int n = arr.length;
        int maxSum = Integer.MIN_VALUE; // stores maximum sum

        for (int start = 0; start < n; start++) {

            int currSum = 0;            // reset for each start index

            for (int end = start; end < n; end++) {
                currSum += arr[end];   // incremental sum
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        return maxSum;                  // final result
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("Print all subarrays + max subarray sum:\n");

        int[] arr = {1, -2, 6, -1, 3};

        printAllSubarrays(arr);              // print all subarrays
        int maxSum = getMaxSubarraySum(arr); // compute max subarray sum

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}
