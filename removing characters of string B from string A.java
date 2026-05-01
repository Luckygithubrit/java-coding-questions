// Problem Statement: Remove Characters from String

// You are given two strings:

// String A → the original string
// String B → a set of characters to be removed

// Your task is to remove all characters from string A that are present in string B and print the resulting string.

// 📥 Input Format
// First line: String A
// Second line: String B
// 📤 Output Format
// Print a single string:
// Resulting string after removing characters of B from A
// 🧪 Example 1
// Input:
// tiger
// ti
// Explanation:
// Remove 't' and 'i' from "tiger"
// Remaining → "ger"
// Output:
// ger
// 🧪 Example 2
// Input:
// banana
// an

import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String A = sc.nextLine();
        String B = sc.nextLine();

        String result = "";

        for (int i = 0; i < A.length(); i++) {
            char ch = A.charAt(i);

            
            if (B.indexOf(ch) == -1) {
                result += ch;
            }
        }

        System.out.println(result);
    }
}


// or

StringBuilder result = new StringBuilder();

for (int i = 0; i < A.length(); i++) {
    char ch = A.charAt(i);

    if (B.indexOf(ch) == -1) {
        result.append(ch);
    }
}

System.out.println(result);