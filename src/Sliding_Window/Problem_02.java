package Sliding_Window;

public class Problem_02 {

    // Minimum length of subarray with sum >= target (sliding window)
    public static int minSubarrayLength(int[] arr, int target) {

        int left = 0;
        int windowSum = 0;
        int minLength = Integer.MAX_VALUE;

        for (int right = 0; right < arr.length; right++) {
            windowSum += arr[right];

            while (windowSum >= target) {
                int currentLength = right - left + 1;
                if (currentLength < minLength) {
                    minLength = currentLength;
                }

                windowSum -= arr[left];
                left++;
            }
        }

        return (minLength == Integer.MAX_VALUE) ? 0 : minLength;
    }

    public static void main(String[] args) {

        System.out.println("WELCOME BACK");

        int[] arr = {1, 2, 4, 4};
        int target = 4;

        int result = minSubarrayLength(arr, target);
        System.out.println(result);
    }
}

