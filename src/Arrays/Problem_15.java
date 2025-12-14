package Arrays;

public class Problem_15 {

    // Find maximum subarray sum using Kadane's Algorithm
    public static void Kadane_algo(int[] arr) {

        int currSum = 0;                     // current running sum
        int maxSum = Integer.MIN_VALUE;      // stores maximum subarray sum

        for (int i = 0; i < arr.length; i++) {

            currSum += arr[i];               // add current element

            if (currSum < 0) {               // reset if sum becomes negative
                currSum = 0;
            }

            if (currSum > maxSum) {          // update maximum
                maxSum = currSum;
            }
        }

        // Normal Kadane case
        if (maxSum != 0) {
            System.out.println("Maximum Subarray Sum = " + maxSum);
        }
        // Special case when all elements are negative
        else {
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > max) {
                    max = arr[i];
                }
            }

            System.out.println("Max sub array sum is " + max);
        }
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("WAP to find max sub array sum using KADANE ALGORITHM\n");

        int[] arr2 = {-4, 20, -1, 13, -5, -6, -3, 8};

        Kadane_algo(arr2);

        // Kadane’s Algorithm key points:
        // Works for contiguous subarrays only
        // Time Complexity -> O(n)
        // Space Complexity -> O(1)
        // If all elements are negative, return the maximum element
    }
}
