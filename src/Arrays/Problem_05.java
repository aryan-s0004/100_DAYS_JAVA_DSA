package Arrays;

public class Problem_05 {

    // Two-pointer approach to find a pair with given difference
    public static void two_diff(int[] arr, int key) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            int diff = arr[right] - arr[left];

            if (diff == key) {
                System.out.println("Indices found at " + left + " " + right);
                return;
            } else if (diff > key) {
                right--; // reduce difference
            } else {
                left++;  // increase difference
            }
        }

        // System.out.println("Pair not found!! ");
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("WAP to solve two diff problem");

        // Find first pair with difference K
        // If arr[right] - arr[left] == k → pair found
        // If difference is large → move right
        // If difference is small → move left

        int[] arr3 = {3, 7, 19, 24, 31, 87}; // sorted array
        int target = 12;

        two_diff(arr3, target);
    }
}
