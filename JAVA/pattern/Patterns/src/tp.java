
import java.util.Arrays;


public class tp {
    public static void main(String [] args){
        String a="bac";
        
        
        char s[]=a.toCharArray();
        
        for(int i=0;i<s.length;i++){
            System.out.println(s[i]);
        }
        Arrays.sort(s);
        
        for(int i=0;i<s.length;i++){
            System.out.print(s[i]);
        }
    }
}
