package Arrays;

public class Problem_03 {

    // Main function starts here
    public static void main(String[] args) {

        System.out.println("Pair in arrays");

        int[] arr = {2, 4, 6, 8, 10}; // input array
        int tp = 0;                  // total pairs counter

        for (int i = 0; i < arr.length; i++) {

            int cur = arr[i]; // current element

            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + cur + "," + arr[j] + ")"); // print pair
                tp++;
            }

            System.out.println(); // move to next line
        }

        System.out.println("Total number of pairs: " + tp); // final count
    }
}
