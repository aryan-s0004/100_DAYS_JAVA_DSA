package Arrays;

public class Problem_25 {

    // Search Insert Position Function
    public static int searchInsert(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans = n;   // default insertion position (end)

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ans = mid;          // possible position
                right = mid - 1;    // move left for first valid index
            } else {
                left = mid + 1;     // move right
            }
        }
        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[] arr = {-55, -30, -2, 3, 32, 44, 55, 69, 87, 952, 1452};
        int target = 55;

        int index = searchInsert(arr, target);

        System.out.println("Search Insert Position index: " + index);
    }
}
