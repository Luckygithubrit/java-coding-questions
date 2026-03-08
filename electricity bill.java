// Write a Java program to calculate the electricity bill based on the number of units consumed.

// The billing criteria are as follows:

// For the first 100 units, the cost is ₹1 per unit.

// For the next 100 units (101–200), the cost is ₹2 per unit.

// For units above 200, the cost is ₹3 per unit.

// The program should:

// Take the total number of units consumed as input from the user.

// Calculate the total electricity bill according to the given slab rates.

// Display the total bill amount.

// Example

// Input:

// Enter the total units: 250

// Output:

// Total bill: 450
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the total units:");
        int units=sc.nextInt();
        int bill=0;
        if(units<=100){
            bill=units*1;
        }
        else if(units>100&&units<=200){
            bill=(100*1)+(units-100)*2;
        }
        else{
            bill=(100*1)+(100)*2+(units-200)*3;
        }
        System.out.println("total bill:"+bill);
    }
}





// Explanation

// First 100 units → 100 × 1 = 100

// Next 100 units → 100 × 2 = 200

// Remaining 50 units → 50 × 3 = 150

// Total bill = 450
