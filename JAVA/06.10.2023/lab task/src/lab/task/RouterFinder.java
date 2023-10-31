package lab.task;

import java.util.Scanner;



public class RouterFinder {
    
    void route(String src,String via,String dest){
        System.out.println("Moving from "+src+" to "+dest+" via "+via);
    }
    void route(String src,String dest){
        System.out.println("Moving from "+src+" to "+dest);
    }
    void route(String dest){
        System.out.println("Moving from "+dest);
    }
    
    public static void main(String[] args) {
       
        RouterFinder rf=new RouterFinder();
        
        System.out.println("Please enter:");
        System.out.println("1. for destination only.");
        System.out.println("2. for source and destination.");
        System.out.println("3. for source,via and destination.");
        
        Scanner sc=new Scanner(System.in);
        Scanner sc1=new Scanner(System.in);
        
        int choice=sc1.nextInt();
        switch(choice){
        
            case 1:
                System.out.println("Enter Destination:");
                String d=sc.nextLine();
                rf.route(d);
                break;
                
            case 2:
                System.out.println("Enter Source and Destination:");
                String s=sc.nextLine();
                String d1=sc.nextLine();
                rf.route(s,d1);
                break;
                
            case 3:
                System.out.println("Enter Source, via and Destination:");
                String s1=sc.nextLine();
                String v=sc.nextLine();
                String d2=sc.nextLine();
                rf.route(s1,v,d2);
                break;
            
            default:
                System.out.println("Please Enter correct option.");
            
        }
        
    }
    
}
