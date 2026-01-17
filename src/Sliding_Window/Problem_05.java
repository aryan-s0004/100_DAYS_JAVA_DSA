package Sliding_Window;

public class Problem_05 {

    public static void sum_Subarr(int[] arr, int k) {

        int n = arr.length;

        if (n < k) {
            System.out.println("Window cannot be formed");
            return;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int totalSum = windowSum;   // add first window sum
        int left = 0;

        for (int right = k; right < n; right++) {
            windowSum = windowSum - arr[left] + arr[right];
            left++;
            totalSum += windowSum;  // add each window sum
        }

        System.out.println(totalSum);
    }

    public static void main(String[] args) {

        int[] arr = {3, -51, 9, 778, -5, -5, -5, -5, -5, -5};
        int k = 3;

        sum_Subarr(arr, k);
    }
}