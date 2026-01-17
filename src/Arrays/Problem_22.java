package Arrays;

public class Problem_22 {

    // Function to find maximum element and its index
    public static void max2D(int[][] arr) {

        int max = arr[0][0];
        int row = 0;
        int col = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] > max) {
                    max = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }

        System.out.println("Maximum Element: " + max);
        System.out.println("Index: (" + row + "," + col + ")");
    }

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {578, 6, 7},
                {9, 10, 11}
        };

        max2D(matrix);
    }
}
