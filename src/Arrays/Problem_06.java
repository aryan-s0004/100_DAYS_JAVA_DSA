package Arrays;

public class Problem_06 {

    // Swap elements in array using indices
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Move all zeros to the end of the array
    public static void Move_Zeros(int[] arr) {

        int num = 0; // index for non-zero elements

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                swap(arr, i, num); // place non-zero at correct position
                num++;
            }
        }
    }

    // Traverse and print array
    public static void traverse_Arr(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        System.out.println("Move Zeros to end");

        int[] arr2 = {1, 40, 5, 0, 7, 0, 0, 8, 12};

        Move_Zeros(arr2);
        traverse_Arr(arr2);
    }
}
