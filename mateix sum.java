// TCS CODING QUESTION
// 🧾 Problem Statement: Maximum Row and Column Sum

// You are given two integers representing the number of rows (R) and columns (C) of a matrix. You are also given a one-dimensional array of size R × C.

// Your task is to:

// Convert the given 1D array into a 2D matrix of size R × C (fill the matrix row-wise).
// Find the maximum sum among all rows.
// Find the maximum sum among all columns.
// Print the sum of the maximum row sum and maximum column sum.
// 📥 Input Format
// First line: Integer R (number of rows)
// Second line: Integer C (number of columns)
// Third line: R × C space-separated integers (elements of the array)
// 📤 Output Format
// Print a single integer:
// (maximum row sum + maximum column sum)
// 🧪 Example 1
// Input:
// 2
// 2
// 1 2 5 6
// Matrix:
// 1 2
// 5 6
// Explanation:
// Row sums → 3, 11 → max = 11
// Column sums → 6, 8 → max = 8
// Output:
// 19

import java.util.*;

public class Lucky{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt(); // rows
        int C = sc.nextInt(); // columns

        int[] arr = new int[R * C];

        for (int i = 0; i < R * C; i++) {
            arr[i] = sc.nextInt();
        }

        int[][] matrix = new int[R][C];

        // Convert 1D array to 2D matrix
        int index = 0;
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                matrix[i][j] = arr[index++];
            }
        }

        // Find max row sum
        int maxRowSum = Integer.MIN_VALUE;

        for (int i = 0; i < R; i++) {
            int sum = 0;
            for (int j = 0; j < C; j++) {
                sum += matrix[i][j];
            }
            maxRowSum = Math.max(maxRowSum, sum);
        }

        // Find max column sum
        int maxColSum = Integer.MIN_VALUE;

        for (int j = 0; j < C; j++) {
            int sum = 0;
            for (int i = 0; i < R; i++) {
                sum += matrix[i][j];
            }
            maxColSum = Math.max(maxColSum, sum);
        }

        
        System.out.println(maxRowSum + maxColSum);
    }
}