
package exceptionhandling;

import java.util.Scanner;


public class VoterValidity {
    void checkValidity(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        
        if(age>=18){
            System.out.println("Congrts, You are eligible for voting...");
        }
        else
        {
            try{
            throw new InvalidEntryException("bhai abhi tum chote ho....politics se door raho..");
            }
            catch(Exception ie){
            //System.out.println(ie.getMessage());
            System.err.println(ie.getMessage());
            }
        }
    }
}
