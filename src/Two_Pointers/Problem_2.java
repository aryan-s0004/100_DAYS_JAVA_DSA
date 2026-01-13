package Two_Pointers;

public class Problem_2 {

    // Swap characters in char array
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse entire string
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }

        return new String(arr);
    }

    // Print utility
    public static void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        // Problem description
        System.out.println("Problem: Reverse Entire String");
        System.out.println("Description: Reverse all characters including spaces and special characters\n");

        String input = "Hello word in java";
        String reversed = reverseString(input);

        printString("Original String : " + input);
        printString("Reversed String : " + reversed);
    }
}
