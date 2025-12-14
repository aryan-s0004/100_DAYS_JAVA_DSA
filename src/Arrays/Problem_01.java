package Arrays;

public class Problem_01 {

    // Linear Search function without return type (prints result)
    public static void LinearSearch(int[] arr, int target) {

        boolean isFound = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                isFound = true;
                System.out.println("Element found at index " + i);
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found");
        }
    }

    // Main function starts here
    public static void main(String[] args) {

        System.out.println("LINEAR SEARCH IN JAVA\n");

        // Using flag-based linear search
        int[] arr = {21, 44, 56, 99, 87, 52, 31, 47, 210};
        LinearSearch(arr, 2100);

        int[] arr2 = {44, 65, 87, 99, 62, 310, 245};
        LinearSearch(arr2, 6214);

        // Main function ends here
    }
}
