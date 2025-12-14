package Arrays;

public class Problem_11 {

    // Print all unique elements using brute-force approach
    public static void Unique_element(int[] arr) {

        int uniqueCount = 0; // count of unique elements

        for (int i = 0; i < arr.length; i++) {

            int count = 0; // reset count for current element

            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == arr[i]) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(arr[i]);
                uniqueCount++;
            }
        }

        if (uniqueCount == 0) {
            System.out.println("No unique element found");
        }
    }

    // Approach 2: Using XOR (works only when exactly one element is unique)
    public static int findUnique(int[] arr) {

        int xor = 0;

        for (int i = 0; i < arr.length; i++) {
            xor = xor ^ arr[i]; // XOR each element
        }

        return xor; // final unique element
    }

    // Main function
    public static void main(String[] args) {

        int[] arr2 = {2, 7, 7, 1, 3, 4, 4, 4, 1, 3, 5, 4, 13, 5, 2};

        Unique_element(arr2);

        int res = findUnique(arr2);

        if (res == 0) {
            System.out.println("No unique element found");
        } else {
            System.out.println("Result : " + res);
        }
    }
}
