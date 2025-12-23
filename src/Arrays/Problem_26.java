package Arrays;

public class Problem_26 {

    // Ceil Function: returns value (not index)
    public static int ceil(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans = -1;   // default: ceil does not exist

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                ans = arr[mid];     // possible ceil value
                right = mid - 1;    // search left for smaller valid value
            } else {
                left = mid + 1;     // search right
            }
        }
        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[] arr = {-55, -30, -2, 3, 32, 44, 55, 69, 87, 952, 1452};

        int target = 50;

        int ceilValue = ceil(arr, target);

        if (ceilValue != -1) {
            System.out.println("Ceil value: " + ceilValue);
        } else {
            System.out.println("Ceil does not exist");
        }
    }
}
