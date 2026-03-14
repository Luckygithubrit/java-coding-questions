// question:
// Given a string s consisting of only 'r' and 'l' characters, return the number of balanced substrings in s. A balanced substring is a substring that has an equal number of 'r' and 'l' characters.


import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		int balance=0;
		int count=0;
		for(int i=0;i<a.length();i++){
		    char ch=a.charAt(i);
		    if(ch=='r'){
		        balance++;
		    }
		    else{
		        balance--;
		    }
		    if(balance==0){
		    count++;
		}
		}
		
		System.out.println(count);
	}
}