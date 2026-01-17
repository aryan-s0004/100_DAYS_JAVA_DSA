package Arrays;
public class Problem_27 {
    // Floor Function: returns value (greatest element <= target)
    public static int floor(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int ans = -1;   // default: floor does not exist

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= target) {
                ans = arr[mid];     // possible floor value
                left = mid + 1;     // search right for larger valid value
            }
            else {
                right = mid - 1;    // search left
            }
        }
        return ans;
    }

    // MAIN FUNCTION
    public static void main(String[] args) {

        int[] arr = {-55, -30, -2, 3, 32, 44, 55, 69, 87, 952, 1452};
        int target = 50;

        int floorValue = floor(arr, target);

        if (floorValue != -1) {
            System.out.println("Floor value: " + floorValue);
        } else {
            System.out.println("Floor does not exist");
        }
    }
}
