package Arrays;

public class Problem_08 {

    // ITERATIVE BINARY SEARCH FUNCTION
    // Finds the last occurrence of target in sorted array
    // Returns index if found, otherwise -1
    public static int binarySearch(int[] arr, int target) {

        int left = 0;                  // starting index
        int right = arr.length - 1;    // ending index
        int ans = -1;                  // stores last occurrence

        // Loop while search space is valid
        while (left <= right) {

            int mid = left + (right - left) / 2; // middle index

            if (arr[mid] == target) {
                ans = mid;            // update answer
                left = mid + 1;       // move right to find last occurrence
            } else if (target < arr[mid]) {
                right = mid - 1;      // search left half
            } else {
                left = mid + 1;       // search right half
            }
        }

        return ans; // return last occurrence index
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        System.out.println("BINARY SEARCH IN JAVA - ITERATIVE APPROACH");

        // Sorted array for binary search
        int[] arr = {-8, -4, -2, 0, 3, 3, 10, 12, 12, 15, 15, 32, 32, 44, 55, 69, 87, 952, 1452};

        int target = -2; // element to search

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
