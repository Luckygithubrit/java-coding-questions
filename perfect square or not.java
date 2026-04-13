import java.util.*;

public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the String:");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<a/2;i++){
		    if(a%i==0){
		        sum=sum+i;
		    }
		}
		if(sum==a){
		    System.out.println("perfect square");
		}
		else{
		    System.out.println("no");
		}
		
		
	}
}