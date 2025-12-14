package Arrays;

public class Problem_16 {

    // Approach 1: Check palindrome using two pointers
    public static boolean isPalindromeDirect(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            if (arr[left] != arr[right]) {
                return false; // mismatch found
            }
            left++;
            right--;
        }

        return true; // palindrome
    }

    // Reverse array using two pointers
    public static int[] reverseArray(int[] arr) {

        int l = 0;
        int r = arr.length - 1;

        while (l < r) {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }

        return arr;
    }

    // Compare two arrays element by element
    public static boolean manualCompare(int[] a, int[] b) {

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false; // mismatch
            }
        }

        return true; // arrays are equal
    }

    // Print array elements
    public static void printArray(int[] arr) {

        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        int[] original = {1, 2, 3, 4, 3, 2, 11};

        System.out.print("Original: ");
        printArray(original);

        // Approach 1: Direct palindrome check
        if (isPalindromeDirect(original)) {
            System.out.println("Approach 1: Palindrome");
        } else {
            System.out.println("Approach 1: Not Palindrome");
        }

        // Create a copy of original array
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
        }

        // Reverse the copied array
        reverseArray(copy);

        System.out.print("Reversed: ");
        printArray(copy);

        // Approach 2: Compare original and reversed arrays
        if (manualCompare(original, copy)) {
            System.out.println("Approach 2: Palindrome");
        } else {
            System.out.println("Approach 2: Not Palindrome");
        }
    }
}
