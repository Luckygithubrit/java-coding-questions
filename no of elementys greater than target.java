// question: Given an array of integers and a target value, count the number of elements in the array that are greater than or equal to the target.
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the size:");
	    int a=sc.nextInt();
	    System.out.println("enter the number:");
	    int arr[]=new int[a];
	    for(int i=0;i<a;i++){
	        arr[i]=sc.nextInt();
	    }
	    int count=0;
	    System.out.println("enter the target:");
	    int target=sc.nextInt();
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>=target){
	            count++;
	        }
	        
	    }
		System.out.println("the count is:"+count);
	}
}