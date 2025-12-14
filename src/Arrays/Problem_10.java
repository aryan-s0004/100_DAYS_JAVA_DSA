package Arrays;

public class Problem_10 {
        public static int SRSA(int[] arr, int target) {
            int left = 0, right = arr.length - 1;

            while (left <= right) {
                int mid = left + (right - left) / 2;

                if (arr[mid] == target)
                    return mid;

                // LEFT HALF SORTED
                if (arr[left] <= arr[mid]) {
                    if (arr[left] <= target && target <= arr[mid]) {
                        right = mid - 1;
                    }
                    else  {
                        left = mid + 1;
                    }
                }

                // RIGHT HALF SORTED
                else {
                    if (arr[mid] <= target && target <= arr[right]) {
                        left = mid + 1;
                    }
                    else {
                        right = mid - 1;
                    }
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int[] arr2 = {7, 6, 5, 4, 0, 1, 2, 3};
            int key = 0;

            int ans = SRSA(arr2, key);
            System.out.println("Target found at index : " + ans);
        }
    }




