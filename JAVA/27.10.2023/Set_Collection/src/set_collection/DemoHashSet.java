
package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


public class DemoHashSet {

    
    public static void main(String[] args) {
       // Set<Integer> st=new HashSet<>();
       // Set<Integer> st=new LinkedHashSet<>();
        Set<Integer> st=new TreeSet<>();
        st.add(10);
        st.add(80);
        st.add(50);
        st.add(20);
        st.add(90);
        st.add(50);
        
       // System.out.println(st);
       
       for(Integer i:st){
           System.out.println(i);
       }
        
    }
    
}
