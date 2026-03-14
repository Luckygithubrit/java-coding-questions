// Problem: Format a Number with Thousand Separators

// Write a program that reads an integer number and prints it with dots . as thousand separators.

// A dot . should be inserted after every three digits from the right.

// Do not add a dot at the beginning.

// The number can be very large (up to 18 digits).

// Input Format

// A single line containing the integer number N (as a string or integer).

// Output Format

// The number formatted with dots . as thousand separators.

// Example 1

// Input

// 123456789

// Output

// 123.456.789

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int count=0;
		String result="";
		for(int i=a.length()-1;i>=0;i--){
		    result=a.charAt(i)+result;
		    count++;
		    if(count%3==0&&i!=0){
		        result="."+result;
		    }
		}
		
		System.out.println(result);
	}
}