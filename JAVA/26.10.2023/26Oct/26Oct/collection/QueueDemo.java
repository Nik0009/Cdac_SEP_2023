package collection;
import java.util.PriorityQueue;

public class QueueDemo {
    public static void main(String[] args) {
        PriorityQueue<String> q=new PriorityQueue<>();
        
        q.add("Ramesh");
        q.add("Suresh");
        q.add("Dinesh");
        q.add("Mahesh");
        q.add("Bahvesh");
        
        System.out.println(q);
        
//        System.out.println(q);
//        for(String s:q){
//           String p=q.poll();
//            System.out.println(p);
//        }
        String s=q.poll();
        System.out.println(s);
        System.out.println(q);
        
        String s1=q.poll();
        System.out.println(s1);
        System.out.println(q);
        
        String s2=q.poll();
        System.out.println(s2);
        System.out.println(q);
        
        String s3=q.poll();
      System.out.println(s3);
        System.out.println(q);
       
    }
}
