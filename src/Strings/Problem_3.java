package Strings;

public class Problem_3 {

    // Swap characters at given indices
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse string using two-pointer approach
    public static String reverseTwoPointer(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            swap(chars, left, right);
            left++;
            right--;
        }
        return new String(chars);
    }

    // Reverse string using simple iterative loop
    public static String reverseIterative(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }

    public static void main(String[] args) {

        String input = "Hello World in JAVA";

        String twoPointerResult = reverseTwoPointer(input);
        String iterativeResult = reverseIterative(input);

        System.out.println("Original String        : " + input);
        System.out.println("Two Pointer Reverse    : " + twoPointerResult);
        System.out.println("Iterative Reverse      : " + iterativeResult);
    }
}
