package Arrays;

public class Problem_31 {

    public static int removeDuplicates(int[] arr) {

        int left = 0;
        int right = 1;
        int n = arr.length - 1;
        int No_Of_Unique = 1;   // first element is always unique

        while (right < n) {

            // if current and next elements are same → skip duplicate
            if (arr[right] == arr[right + 1]) {
                right++;
            }
            // new unique element found
            else {
                arr[left + 1] = arr[right];
                left++;
                No_Of_Unique++;
                right++;
            }
        }

        return No_Of_Unique;
    }

    public static void main(String[] args) {

        System.out.println("WAP TO REMOVE DUPLICATES , RETURN UNIQUE ELEMENTS IN ARRAYS");

        int[] arr2 = {1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5};

        int result = removeDuplicates(arr2);
        System.out.println(result);
    }
}
