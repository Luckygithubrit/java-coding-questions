// Write a Java program to simulate a simple ATM withdrawal system.

// The program should:

// Ask the user to enter the withdrawal amount.

// Ask the user to enter the available account balance.

// Apply the following conditions:

// The withdrawal amount must be at least ₹100.

// The withdrawal amount must be a multiple of 100.

// The withdrawal amount should not exceed the available balance.

// Output Conditions

// If the withdrawal amount is less than 100 or not a multiple of 100, display:
// "Invalid"

// If the withdrawal amount is greater than the available balance, display:
// "Insufficient amount!"

// Otherwise, perform the withdrawal and display:
// "Withdraw successful" along with the remaining balance.

// Example

// Input

// Withdrawal amount: 500
// Available balance: 2000

// Output

// Withdraw successful 1500

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("withdrawl amount:");
        int n=sc.nextInt();
        System.out.println("available balance");
        int a=sc.nextInt();
        if(n<100||n%100!=0){
            System.out.println("invalid");
        }
        else if(n>a){
            System.out.println("insuffucient amount!");
        }
        else{
           int remainingbal=a-n;
           System.out.println("withdraw successfull "+remainingbal);
        }
        
    }
}