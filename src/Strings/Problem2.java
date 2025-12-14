package Strings;

public class Problem2 {

    // Function to check if a string is palindrome
    public static boolean isPalindrome(String str) {

        int n = str.length();

        // Compare characters from start and end
        for (int i = 0; i < n / 2; i++) {

            if (str.charAt(i) != str.charAt(n - i - 1)) {
                return false; // mismatch found
            }
        }

        return true; // palindrome if no mismatch
    }

    // Main function
    public static void main(String[] args) {

        System.out.println("WAP TO CHECK STRING IS PALINDROME");

        String word = "RACECAR";
        System.out.println(isPalindrome(word));

        // String comparison examples
        String str1 = "Tony";
        String str2 = "TONY";
        String str3 = new String("Tony");

        // == compares reference, not content
        System.out.println(str1 == str3);

        // equals() compares actual content
        System.out.println(str1.equals(str3));

        // equalsIgnoreCase() ignores case sensitivity
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
