package collection;

import java.util.*;
public class DemoArrayList_01 {
    public static void main(String[] args) {
        ArrayList<Integer> lst=new ArrayList<>();
        lst.add(23);
        lst.add(12);
        lst.add(22);
        lst.add(14);
        lst.add(62);
//        System.out.println(lst.get(2)+15);
        Collections.sort(lst);
//        int pos=Collections.binarySearch(lst, 25);
//Collections.copy(lst,Arrays.asList(100,200,300));
//        System.out.println("position "+b);
    List<String> lst1=Arrays.asList("Dindayal","Ramesh","Suresh","Dinesh","Bhavesh");
    Collections.sort(lst1);
    System.out.println("************");
        
        for(String i:lst1)
            System.out.println(i);
    }
}
