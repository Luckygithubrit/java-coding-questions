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