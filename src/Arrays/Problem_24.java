package Arrays;

public class Problem_24 {

    // Lower Bound Function
    public static int upperBound(int[] arr, int target) {
        int n = arr.length;
        int left = 0;
        int right = n - 1;
        int ans = n;   // default: insertion at end

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                ans = mid;          // possible answer
                right = mid - 1;    // search left for first occurrence
            } else {
                left = mid + 1;     // search right
            }
        }

        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        System.out.println("WAP TO FIND LOWER BOUND");

        int[] arr = {-55, -30, -2, 3, 32, 44, 55, 69, 87, 952, 1452};
        int target = 86;

        int index = upperBound(arr, target);

        if (index < arr.length) {
            System.out.println("Upper Bound index: " + index);
            System.out.println("Upper Bound value: " + arr[index]);
        } else {
            System.out.println("Upper Bound index: " + index + " (Insertion at end)");
        }
    }
}
