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