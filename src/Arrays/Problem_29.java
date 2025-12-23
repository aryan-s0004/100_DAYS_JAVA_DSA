package Arrays;
public class Problem_29 {

    // First Occurrence Function
    public static int lastOccurrence(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                ans = mid;          // possible first occurrence
                left = mid + 1;
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
        int target = 9;

        int index = lastOccurrence(arr, target);

        if (index != -1) {
            System.out.println("Last occurrence index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
