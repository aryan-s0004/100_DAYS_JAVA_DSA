package Two_Pointers;

public class Problem_3 {

    // Swap characters in char array
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Reverse characters between two indices
    public static void reverseRange(char[] arr, int left, int right) {
        while (left < right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }

    // Reverse entire string
    public static String reverseString(String str) {
        char[] arr = str.toCharArray();
        reverseRange(arr, 0, arr.length - 1);
        return new String(arr);
    }

    // Reverse each word in a string
    public static String revEachWord(String str) {
        char[] arr = str.toCharArray();
        int start = 0;

        for (int i = 0; i <= arr.length; i++) {

            // space OR end of string
            if (i == arr.length || arr[i] == ' ') {
                reverseRange(arr, start, i - 1);
                start = i + 1;
            }
        }

        return new String(arr);
    }

    // Print utility
    public static void printString(String str) {
        System.out.println(str);
    }

    public static void main(String[] args) {

        // Problem description
        System.out.println("Problem: Reverse Each Word in a String");
        System.out.println("Description: Reverse characters of every word while keeping word order same\n");

        String input = "Hello olleh word drow in ni avaj java";

        printString("Original String : " + input);
        printString("Each Word Rev   : " + revEachWord(input));
    }
}


