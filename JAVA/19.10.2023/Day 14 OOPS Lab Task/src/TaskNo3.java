
import java.util.Scanner;


//
//Q3. Create a user-defined exception class InsufficientFundException that extends
//Exception. Write a Java program that simulates a bank account and throws an
//InsufficientFundsException when trying to withdraw more money than the
//account balance.


class InsufficientFundException extends Exception{
    
    InsufficientFundException(String msg) {
        super(msg);
    }
}

public class TaskNo3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int accBal=500000;
        System.out.println("Enter amount for withdraw money:");
        int n=sc.nextInt();
        
        if(n>accBal){
            try {
                throw new InsufficientFundException("Insufficient Fund In Your Account..!!!\nPlease Enter Valid Amount..!!!");
            } catch (InsufficientFundException ex) {
                System.out.println(ex.getMessage());
            }
        }
        else{
            System.out.println("you enter rs."+n+" you can withdraw money from your account !!!");
        }
        
    }
}
