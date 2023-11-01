
package set_collection;

import java.util.ArrayList;
import java.util.List;


public class BackupDemo {
    public static void main(String[] args) {
        
        List<Integer> originallst=new ArrayList<>();
        originallst.add(100);
        originallst.add(200);
        originallst.add(800);
       
        
        List<Integer> backuplst=originallst.subList(0,2 );
        
        System.out.println(originallst);
        System.out.println(backuplst);
        
        backuplst.add(700);
        backuplst.add(500);
        backuplst.remove(1);
        
        System.out.println(originallst);
        System.out.println(backuplst);

        
        
    }
}
