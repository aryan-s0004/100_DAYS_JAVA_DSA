package Arrays;

public class Problem_18 {

    // Find second largest element
    public static int secondLargest(int[] arr) {

        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > firstMax) {
                secondMax = firstMax;
                firstMax = arr[i];
            } else if (arr[i] > secondMax && arr[i] != firstMax) {
                secondMax = arr[i];
            }
        }

        return secondMax;
    }

    // Find second smallest element
    public static int secondSmallest(int[] arr) {

        int firstMin = Integer.MAX_VALUE;
        int secondMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < firstMin) {
                secondMin = firstMin;
                firstMin = arr[i];
            } else if (arr[i] < secondMin && arr[i] != firstMin) {
                secondMin = arr[i];
            }
        }

        return secondMin;
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

        System.out.println("2nd Largest Element  : " + secondLargest(arr));
        System.out.println("2nd Smallest Element : " + secondSmallest(arr));
    }
}
