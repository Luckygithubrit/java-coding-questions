// Problem Statement: Two-Wheeler and Four-Wheeler Production

// A company manufactures two types of vehicles:

// Two-wheelers (TW) → each has 2 wheels
// Four-wheelers (FW) → each has 4 wheels

// You are given:

// Total number of vehicles (V)
// Total number of wheels (W)

// Your task is to determine how many two-wheelers and four-wheelers are manufactured.

// 📥 Input Format
// First line: Integer V (total number of vehicles)
// Second line: Integer W (total number of wheels)
// 📤 Output Format
// If the input is valid, print:
// TW=<number of two-wheelers> FW=<number of four-wheelers>
// If the input is invalid, print:
// Invalid Input
// 🧪 Example 1
// Input:
// 200
// 540
// Explanation:
// TW + FW = 200
// 2(TW) + 4(FW) = 540
// FW = 70, TW = 130
// Output:
// TW=130 FW=70


import java.util.*;

public class Lucky {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int V = sc.nextInt(); //vehicles
        int W = sc.nextInt(); //wheels

     
        if (W < 2 * V || W % 2 != 0) {
            System.out.println("Invalid Input");
            return;
        }

        int FW = (W - 2 * V) / 2;
        int TW = V - FW;

        if (TW < 0 || FW < 0) {
            System.out.println("Invalid Input");
        } else {
            System.out.println("TW=" + TW + " FW=" + FW);
        }
    }
}