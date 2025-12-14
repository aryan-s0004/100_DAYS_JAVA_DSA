package Arrays;

public class Problem02 {

    // -------------------------------------------------------
    // ITERATIVE BINARY SEARCH FUNCTION
    // -------------------------------------------------------
    // Searches target in sorted array and returns index or -1
    public static int binarySearch(int[] arr, int target) {

        int left = 0;                 // starting index
        int right = arr.length - 1;   // ending index

        // Loop until search space is valid
        while (left <= right) {

            int mid = left + (right - left) / 2; // middle index

            if (arr[mid] == target) {
                return mid; // element found
            } else if (target < arr[mid]) {
                right = mid - 1; // search left half
            } else {
                left = mid + 1; // search right half
            }
        }

        return -1; // element not found
    }

    // -------------------------------------------------------
    // RECURSIVE BINARY SEARCH FUNCTION
    // -------------------------------------------------------
    public static int BS_R(int[] arr2, int key, int st, int end) {

        if (st <= end) {

            int middle = st + (end - st) / 2; // middle index

            if (key > arr2[middle]) {
                return BS_R(arr2, key, middle + 1, end); // search right half
            } else if (key < arr2[middle]) {
                return BS_R(arr2, key, st, middle - 1); // search left half
            } else {
                return middle; // element found
            }
        }

        return -1; // element not found
    }

    // -------------------------------------------------------
    // MAIN FUNCTION
    // -------------------------------------------------------
    public static void main(String[] args) {

        System.out.println("BINARY SEARCH IN JAVA");

        // Sorted array for iterative binary search
        int[] arr = {-55, -30, -2, 3, 32, 44, 55, 69, 87, 952, 1452};
        int target = 55;

        // Sorted array for recursive binary search
        int[] arr2 = {-55, -2, 0, 3, 32, 44, 55, 69, 87, 952, 1452};
        int key = 32;

        int rec_Result = BS_R(arr2, key, 0, arr2.length - 1);
        System.out.println("Recursion result = " + rec_Result);

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in array.");
        }
    }
}
