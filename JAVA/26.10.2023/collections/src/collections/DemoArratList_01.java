
package collections;

import java.util.*;


public class DemoArratList_01 {
    public static void main(String[] args){
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(23);
        lst.add(2);
        lst.add(3);
        lst.add(22);
       // System.out.println(lst.get(2)+15);
        
       Collections.sort(lst);
       //int pos=Collections.binarySearch(lst, 23);
      // int pos=Collections.binarySearch(lst, 232);
          // System.out.println("position:"+pos);
          
       
//       boolean b=Collections.disjoint(lst, Arrays.asList(100,200,300));
//       System.out.println("position:"+b);
       
//        Collections.copy(lst, Arrays.asList(100,200,300));
            
          List<String> lst1 =Arrays.asList("ramesh","suresh","dinesh","dindayal");
          Collections.sort(lst1);
          
       for(String i:lst1){
            System.out.println(i);
        
        }

   
       
//        for(Integer i:lst){
//            System.out.println(i);
//        
//        }
    
    }
}
