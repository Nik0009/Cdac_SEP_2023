package map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

    public static void main(String[] args) {
//        Map<Integer,String> mp =new HashMap<>();
        // Map<Integer,String> mp =new LinkedHashMap<>();
        Map<Integer, String> mp = new TreeMap<>();
        mp.put(101, "ramesh");
        mp.put(106, "suresh");
        mp.put(103, "rajesh");
        mp.put(104, "dinesh");
        mp.put(105, "bhavesh");

//        System.out.println(mp);
//        for(Integer i:mp.keySet()){
//            String val=mp.get(i);
//            System.out.println("key:"+i+" value:"+val+"ji");
//        }


        for (String i : mp.values()) {
            System.out.println( i );
        }
     
   
        
        

    }
}
