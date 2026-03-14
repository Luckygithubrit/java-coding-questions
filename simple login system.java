// question: simple login system in java

import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String username="lucky steven";
	    String password="1234";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the user name:");
		String user=sc.nextLine();
		System.out.println("enter the password:");
		String pass=sc.nextLine();
		if(username.equals(user)&&password.equals(pass)){
		    System.out.println("login succesful");
		}
		else{
		    System.out.println("login failed");
		}


	}
}