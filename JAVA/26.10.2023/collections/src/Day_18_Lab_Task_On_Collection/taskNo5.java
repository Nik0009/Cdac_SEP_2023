
package Day_18_Lab_Task_On_Collection;

import java.util.ArrayDeque;


//Q5. Write a java program to perform insertion at first and at last position in
//Array Dequeue.

public class taskNo5 {
    public static void main(String[] args) {
        ArrayDeque<String> ad=new ArrayDeque<>();
        
        ad.add("rajesh");
        ad.add("mahesh");
        ad.add("suresh");
        ad.add("rajnish");
        
        System.out.println(ad);
        
        // insertion at first position
        ad.addFirst("suraj");
        System.out.println(ad);
        
        // insertion at last position
        ad.addLast("milind");
        System.out.println(ad);
        
    }
}
