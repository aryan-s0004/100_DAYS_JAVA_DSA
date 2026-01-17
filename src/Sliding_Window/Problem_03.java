package Sliding_Window;

public class Problem_03 {

    public static void avg_Subarr(int[] arr, int k) {

        int n = arr.length;

        if (n < k) {
            System.out.println("Window cannot be formed");
            return;
        }

        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        System.out.println((double) windowSum / k);

        int left = 0;

        for (int right = k; right < n; right++) {
            windowSum = windowSum - arr[left] + arr[right];
            left++;
            System.out.println((float) windowSum / k);
        }
    }

    public static void main(String[] args) {

        int[] arr = {-15, -5, 0, 3, -5, -35, 45, -50};

        int k = 3;

        avg_Subarr(arr, k);
    }
}
