package Arrays;
public class Problem_30 {
    static int firstOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                ans = mid;
                r = mid - 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    static int lastOccurrence(int[] arr, int target) {
        int l = 0, r = arr.length - 1, ans = -1;

        while (l <= r) {
            int mid = l + (r - l) / 2;

            if (arr[mid] == target) {
                ans = mid;
                l = mid + 1;
            } else if (arr[mid] < target) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans;
    }

    static int countOccurrences(int[] arr, int target) {
        int first = firstOccurrence(arr, target);
        if (first == -1)
        {
            return 0;
        }

        int last = lastOccurrence(arr, target);
        {
            return last - first + 1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7, 9, 9, 10};
        int target = 9;

        System.out.println(countOccurrences(arr, target));
    }
}
