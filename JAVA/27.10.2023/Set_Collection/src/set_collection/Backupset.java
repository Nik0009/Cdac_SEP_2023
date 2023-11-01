
package set_collection;

 import java.util.HashSet;
import java.util.Set;


public class Backupset {
    public static void main(String[] args) {
        
        Set<Integer> originalSet=new HashSet<>();
        
        originalSet.add(100);
        originalSet.add(400);
        originalSet.add(200);
        originalSet.add(300);
        
        
        //Set<Integer> backupSet=Collections.unmodifiableSet(new HashSet<> (originalSet));
        Set<Integer> backupSet=new HashSet<>(originalSet);
        
        System.out.println(originalSet);
        System.out.println(backupSet);
        
        
        try{
            backupSet.add(500);
        }
        catch(Exception e){}
        
        System.out.println(originalSet);
        System.out.println(backupSet);
        
    }
}
