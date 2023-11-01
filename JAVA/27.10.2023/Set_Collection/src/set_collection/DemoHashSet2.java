package set_collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;




public class DemoHashSet2 {
    public static void main(String[] args) {
        
        List<Integer> lst = Arrays.asList(12,20,12,90);
        Set<Integer> st=new HashSet<>();
        st.addAll(lst);
        
        System.out.println("before");
        System.out.println(lst);
         System.out.println("after converting into set");
        System.out.println(st);
        lst=new ArrayList<>();
        lst.addAll(st);
         System.out.println("after converting list to set");
        System.out.println(lst);
    }
    
}
