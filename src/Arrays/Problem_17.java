package Arrays;

public class Problem_17 {

    // Find first largest element
    public static int firstLargest(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }

    // Find first smallest element
    public static int firstSmallest(int[] arr) {

        int min = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        return min;
    }

    // Traverse array
    public static void traverseArray(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    // Main function
    public static void main(String[] args) {

        int[] arr = {11, 2, 32, 15, 46};

        traverseArray(arr);

        System.out.println("1st Largest Element  : " + firstLargest(arr));
        System.out.println("1st Smallest Element : " + firstSmallest(arr));
    }
}
