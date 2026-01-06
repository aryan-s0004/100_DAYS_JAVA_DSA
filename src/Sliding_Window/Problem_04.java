package Sliding_Window;

public class Problem_04 {

    public static void count_Subarr(int[] arr, int k) {

        int n = arr.length;

        if (n < k) {
            System.out.println("Window cannot be formed");
            return;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        int subarr_count = 1;   // first window counted
        int left = 0;

        for (int right = k; right < n; right++) {
            windowSum = windowSum - arr[left] + arr[right];
            left++;
            subarr_count++;
        }

        System.out.println(subarr_count);
    }

    public static void main(String[] args) {

        int[] arr = {3, 51, 9,78, -5, -5, -5, -5, -5, -5};
        int k = 3;

        count_Subarr(arr, k);
    }
}
