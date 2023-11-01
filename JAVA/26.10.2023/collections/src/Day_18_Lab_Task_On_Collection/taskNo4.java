
package Day_18_Lab_Task_On_Collection;

//Q4. Write a java program to Create a priority queue to insert elements with
//different priorities.

import java.util.PriorityQueue;





public class taskNo4 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        
        pq.add(12);
        pq.add(1);
        pq.add(5);
        pq.add(982);
        pq.add(0);
        pq.add(966);
        
        System.out.println(pq);
        int n=pq.poll();
        System.out.println(n);
        
         int n1=pq.poll();
        System.out.println(n1);
        
         int n2=pq.poll();
        System.out.println(n2);
        
         int n3=pq.poll();
        System.out.println(n3);
        
        int n4=pq.poll();
        System.out.println(n4);
        
        
        System.out.println(pq);
        
    }
}
