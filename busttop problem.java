// Problem: Passengers in a Bus

// A bus travels through several stops. At each stop, some passengers enter the bus and some passengers leave the bus.

// Write a Java program that:

// Takes the number of bus stops as input.

// For each stop, take two inputs:

// Number of passengers entering the bus.

// Number of passengers leaving the bus.

// Calculate and display the total number of passengers remaining in the bus after the last stop.

// Input Format

// First input: An integer N representing the number of stops.

// Next N lines:

// First integer → passengers entering the bus.

// Second integer → passengers leaving the bus.

// Output Format

// Print the remaining number of passengers in the bus.

// Example

// Input

// 3
// 10 0
// 5 3
// 2 4

// Explanation

// Stop 1: 0 + 10 − 0 = 10 passengers

// Stop 2: 10 + 5 − 3 = 12 passengers

// Stop 3: 12 + 2 − 4 = 10 passengers

// Output

// Remaining passengers: 10

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no of stops");
        int a=sc.nextInt();
        int passengers=0;
        for(int i=1;i<=a;i++){
            System.out.println("no of passengers entered:");
            int in=sc.nextInt();
            System.out.println("no of passengers out:");
            int out=sc.nextInt();
            passengers=passengers+in-out;
            
            
        }
        System.out.println("remaining passengers:"+passengers);
    }
}