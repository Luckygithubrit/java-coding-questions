// Problem Statement

// A shopkeeper wants to pack chocolates into boxes. Each box can hold 10 chocolates.

// Write a Java program that:

// Takes the total number of chocolates as input.

// Calculates how many full boxes can be filled.

// Calculates how many chocolates remain unpacked.

// Input

// An integer N representing the total number of chocolates.

// Output

// Print the total number of full boxes.

// Print the remaining chocolates that cannot fill a full box.

// Example

// Input

// enter the no of chocolates
// 57

// Output

// total boxes:5
// remaining chocolates:7
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of chocolates");
        int a=sc.nextInt();
        int boxes=a/10;
        int remaining=a%10;
        
        System.out.println("total boxes:"+boxes);

    }
}