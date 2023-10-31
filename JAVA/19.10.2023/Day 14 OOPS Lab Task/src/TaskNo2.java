
import java.util.Scanner;

//Q2. Create a user-defined exception class NegativeValueException that extends
//Exception. Write a Java program that takes an integer as input and throws a
//NegativeValueException if the input is a negative number.

class NegativeValueException extends Exception{
    public NegativeValueException(String msg){
        super(msg);
    }
}

public class TaskNo2 {
     public static void main(String[] args){
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter any number:");
         int n=sc.nextInt();;
         if(n<0){
         try{
         throw new NegativeValueException("You can not enter negative numbers !!!");
         }
         catch(Exception e){
             System.out.println(e.getMessage());
         }
         }
         else
         {
             System.out.println("number is "+n);
         }
     }
}
