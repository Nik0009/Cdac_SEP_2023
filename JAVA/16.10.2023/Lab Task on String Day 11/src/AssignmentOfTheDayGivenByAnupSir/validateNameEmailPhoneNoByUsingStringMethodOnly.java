
package AssignmentOfTheDayGivenByAnupSir;

import java.util.Scanner;


public class validateNameEmailPhoneNoByUsingStringMethodOnly {
    public static void main(String[] args){
    String name="nikhil";
    String email="nikhil@123";
    String phoneNo="8654746754";
    
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter name to validate:");
    String n=sc.nextLine();
    
    System.out.println("Enter email to validate:");
    String e=sc.nextLine();
    
    System.out.println("Enter Phone No to validate:");
    String p=sc.nextLine();
    
    System.out.println("************************************************************");
    System.out.println("***********************RESULT*************************************");
    System.out.println("************************************************************");
    
    if(n.equals(name)){
        System.out.println(n+" is validate.");
    }
    else
    {
        System.out.println(n+" is not validate.");
    }
    
     if(e.equals(email)){
        System.out.println(e+" is validate.");
    }
    else
    {
        System.out.println(e+" is not validate.");
    }
     
      if(p.equals(phoneNo)){
        System.out.println(p+" is validate.");
    }
    else
    {
        System.out.println(p+" is not validate.");
    }
     
    
    }
}
