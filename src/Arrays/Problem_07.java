package Arrays;

public class Problem_07 {

    // MAIN function starts here
    public static void main(String[] args) {

        System.out.println("WAP to find missing number in 1,2,3,...n\n");

        int actualSum = 0; // sum of given array elements

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 9, 10, 11, 12, 13};

        float n = arr2.length + 1;          // total numbers including missing
        float orgSum = (n / 2) * (n + 1);   // sum of first n natural numbers

        for (int i = 0; i < n - 1; i++) {
            actualSum += arr2[i];
        }

        System.out.println("Original Sum = " + orgSum);
        System.out.println("Actual Sum = " + actualSum);

        float miss_num = orgSum - actualSum; // missing number
        System.out.println("Missing Num = " + miss_num);

        // MAIN function ends here
    }
}
