// Problem Statement

// A water tank is being filled by a pipe.

// The pipe fills 10 litres of water per minute.

// However, there is a leak in the tank.

// Every 5 minutes, 15 litres of water leak out.

// Write a Java program that:

// Takes the total time in minutes as input.

// Calculates the total litres of water filled by the pipe.

// Calculates the total water lost due to leakage.

// Calculates the final amount of water remaining in the tank.

// Input

// An integer T representing the time in minutes.

// Output

// Total litres filled before leakage

// Total litres of water lost

// Remaining litres of water in the tank

// Example

// Input

// enter the time in minutes
// 20

// Output

// total litres before lost = 200 litres
// lost = 60 litres
// remaining = 140 litres

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the time in minutes");
        int time=sc.nextInt();
        int filled=(time*10);
        int lost=(time/5)*15;
        int remaining=filled-lost;
        System.out.println("total litres before lost="+filled+"litres");
        System.out.println("lost="+lost+"litres");
        System.out.println("remaining="+remaining+"litres");

    }
}