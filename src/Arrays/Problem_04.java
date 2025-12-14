package Arrays;

public class Problem_04 {

    // APPROACH 1: BRUTE FORCE (O(n^2))
    // Check every pair (i, j) such that i < j
    // If arr[i] + arr[j] == target → print the pair
    public static void twoSumBruteForce(int[] arr, int target) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println("Pair found at indices: " + i + ", " + j);
                    return;
                }
            }
        }

        System.out.println("No pair found using brute force.");
    }

    // APPROACH 2: TWO-POINTER APPROACH (O(n))
    // Works only when the array is sorted
    // Use two pointers and move them based on sum comparison
    public static void twoSumTwoPointer(int[] arr, int target) {

        int left = 0;                    // left pointer
        int right = arr.length - 1;      // right pointer

        while (left < right) {

            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair found at indices: " + left + ", " + right);
                return;
            } else if (sum < target) {
                left++;                 // increase sum
            } else {
                right--;                // decrease sum
            }
        }

        System.out.println("No pair found using two-pointer approach.");
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        System.out.println("WELCOME BACK");

        int[] arr = {-5, -3, 1, 3, 4, 7, 13}; // sorted array
        int target = 8;

        System.out.println("\n--- Approach 1: Brute Force ---");
        twoSumBruteForce(arr, target);

        System.out.println("\n--- Approach 2: Two Pointer ---");
        twoSumTwoPointer(arr, target);
    }
}
