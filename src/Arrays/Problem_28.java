package Arrays;
public class Problem_28 {

    // First Occurrence Function
    public static int firstOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;          // possible first occurrence
                right = mid - 1;    // move left to find earlier occurrence
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[] arr = {2, 4, 4, 4, 7, 9, 9, 10};
        int target = 4;

        int index = firstOccurrence(arr, target);

        if (index != -1) {
            System.out.println("First occurrence index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
