package Strings;

import java.util.*;

public class Problem1 {

    // Main function
    public static void main(String[] args) {

        // Example string
        String a = "ABCCBA";

        // Find string length
        int len = a.length();
        System.out.println("Length = " + len);

        // Substring example
        String sub = a.substring(0, 3); // extracts characters from index 0 to 2
        System.out.println("Substring = " + sub);

        // Taking input using Scanner
        Scanner sc = new Scanner(System.in);

        // Read single word input
        System.out.print("Enter your name: ");
        String name = sc.next(); // reads only one word
        System.out.println("You entered: " + name);

        // Clear buffer before reading full line
        sc.nextLine();

        // Read full sentence input
        System.out.print("Enter full sentence: ");
        String fullSentence = sc.nextLine();
        System.out.println("Sentence: " + fullSentence);

        // Print length of full sentence
        System.out.println("Sentence length: " + fullSentence.length());

        // Access first character
        System.out.println(fullSentence.charAt(0));

        // Traverse string character by character
        for (int i = 0; i < fullSentence.length(); i++) {
            char c = fullSentence.charAt(i);
            System.out.print(c + " ");
        }
    }
}
