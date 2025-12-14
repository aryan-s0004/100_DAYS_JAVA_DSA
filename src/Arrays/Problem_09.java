package Arrays;

public class Problem_09 {

    // Reverse array using iterative approach
    public static void reverseArray(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            // swap left and right elements
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }

    // Reverse array using recursive approach
    public static void reverseArrayRecursive(int[] arr, int left, int right) {

        if (left >= right) {
            return; // base case
        }

        // swap elements
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        // recursive call
        reverseArrayRecursive(arr, left + 1, right - 1);
    }

    // Main function starts here
    public static void main(String[] args) {

        System.out.println("REVERSE ARRAY IN JAVA");

        // METHOD 1: Iterative approach
        System.out.println("METHOD 1:- Iterative approach (using loop only)");

        int[] arr1 = {45, 11, 32, 65, 98, -51, -3, -201, 77, 214};
        reverseArray(arr1);

        System.out.println("Reversed array :- ");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }

        System.out.println("\n");

        // METHOD 2: Recursive approach
        System.out.println("METHOD 2:- Recursive approach (function calls itself)");

        int[] arr2 = {45, 11, 32, 65, 98, -51, -3, -201, 77, 214};
        reverseArrayRecursive(arr2, 0, arr2.length - 1);

        System.out.println("Reversed array :- ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }

        // Main function ends here
    }
}
