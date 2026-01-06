package Sliding_Window;

public class Problem_04 {

    public static void count_Subarr(int[] arr, int k) {

        int n = arr.length;

        if (n < k) {
            System.out.println("Window cannot be formed");
            return;
        }

        // Short formula (best way)
        System.out.println("Count (formula) = " + (n - k + 1));

        // Loop-based counting (for understanding)
        int count = 0;
        for (int i = 0; i <= n - k; i++) {
            count++;
        }

        System.out.println("Count (loop) = " + count);
    }

    public static void main(String[] args) {

        int[] arr = {3, 51, 9, 78, -5, -5, -5, -5, -5, -5};
        int k = 3;

        count_Subarr(arr, k);
    }
}
