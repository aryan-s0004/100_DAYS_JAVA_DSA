package Arrays;

public class Problem_20 {

    // linear search in 2D array using int return type
    public static int linearSearch2D(int[][] arr, int key) {

        // traversing rows
        for (int i = 0; i < arr.length; i++) {

            // traversing columns
            for (int j = 0; j < arr[i].length; j++) {

                // checking element
                if (arr[i][j] == key) {
                    System.out.println("Element found at index: " + i + " " + j);
                    return 1;
                }
            }
        }

        System.out.println("Element not found");
        return -1;
    }

    /*
    // OLD APPROACH (for understanding, not used)
    // issues: scope problem for i and j, extra flag variable

    public static void Linear_Search_2D(int [][]arr, int key) {
        boolean isFound = false;

        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == key) {
                    isFound = true;
                    break;
                }
            }
        }

        if(isFound) {
            // i and j not accessible here
        }
    }
    */

    public static void main(String[] args) {

        System.out.println("2D ARRAY PROBLEM\n");

        // first 2D array
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        // printing first 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // second 2D array
        int[][] num = new int[2][2];

        // assigning values
        num[0][0] = 1;
        num[0][1] = 2;
        num[1][0] = 3;
        num[1][1] = 4;

        // printing second 2D array
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // searching element in matrix
        int key = 1;
        int result = linearSearch2D(matrix, key);

        System.out.println("Result: " + result);
    }
}
