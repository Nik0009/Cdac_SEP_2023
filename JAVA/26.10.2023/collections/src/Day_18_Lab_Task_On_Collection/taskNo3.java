
package Day_18_Lab_Task_On_Collection;

//Q3. Write a java program to find a name from a collection.

import java.util.ArrayList;
import java.util.Scanner;


public class taskNo3 {
    public static void main(String[] args) {
        ArrayList<String> lst=new ArrayList<>(); 
        lst.add("ashwin");
        lst.add("rahul");
        lst.add("om");
        lst.add("saurabh");
        lst.add("mihir");
        
        
        System.out.println(lst);
        
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter name to find in collections:");
        String str=sc.nextLine();
        
        if(lst.contains(str))
            System.out.println(str+" is present in Collections.");
        else
            System.out.println(str+" is not present in Collections.");
     
    }
}
