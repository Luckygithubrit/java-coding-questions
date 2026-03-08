// Elevator Movement Simulation (Programming Problem)

// Write a Java program to simulate the movement of an elevator in a building.

// The program should first take the following inputs from the user:

// The current floor of the elevator.

// The maximum floor in the building.

// The number of moves the elevator will make.

// For each move, the user will enter an integer representing how the elevator moves:

// A positive number indicates the elevator moves up.

// A negative number indicates the elevator moves down.

// If the move is 0, the elevator does not move.

// The program should perform the following tasks:

// Calculate the next floor after each move.

// If the elevator tries to move below floor 0 or above the maximum floor, the elevator must stop immediately.

// Count the number of upward moves and downward moves.

// Calculate the energy used:

// Add the value of the move to the total energy when the elevator moves up.

// If the upward move is even, add an additional 5 units of energy.

// Update the elevator’s current floor after every valid move.

// After processing all moves (or stopping early), display:

// Final floor of the elevator

// Number of upward moves

// Number of downward moves

// Total energy used

// Elevator status (running or stopped)



import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the current floor :");
        int currentfloor=sc.nextInt();
        System.out.println("enter the maximum floor :");
        int maxfloor=sc.nextInt();
        System.out.println("enter the moves :");
        int n=sc.nextInt();
        int upcount=0;
        int downcount=0;
        int energy=0;
        boolean stopped=false;
        for(int i=0;i<n;i++){
            int moves=sc.nextInt();
            if(moves==0){
                continue;
            }
            int nextfloor=currentfloor+moves;
            if(nextfloor<0||nextfloor>maxfloor){
                stopped=true;
                break;
            }
            if(moves>0){
                upcount++;
                energy=energy+moves;
                if(moves%2==0){
                    energy=energy+5;
                }
            }
                
            
            
            else{
                downcount++;
            }
            currentfloor=nextfloor;
        }
        System.out.println("finalfloor:"+currentfloor);
        System.out.println("upcount:"+upcount);
        System.out.println("downcount:"+downcount);
        System.out.println("energy used"+energy);
        if(stopped){
            System.out.println("the elevator status: stopped");
        }
        else{
            System.out.println("the elevator : running");
        }
        sc.close();
    }
        
        
}
