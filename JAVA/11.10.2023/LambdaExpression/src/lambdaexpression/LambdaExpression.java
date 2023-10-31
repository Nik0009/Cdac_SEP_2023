
package lambdaexpression;

import java.util.logging.Level;
import java.util.logging.Logger;

// user define interface
@FunctionalInterface
interface LengthFinder{
    int strLength(String str);

}


public class LambdaExpression {

   
    public static void main(String[] args) {
        // lambda expression
       LengthFinder lf= (str)->str.length();
       System.out.println("Length is "+lf.strLength("Nikhil Mowade"));
       
       // runnable interface using lambda expxerssion
       // pre define interface
       Runnable r=()->{
           for(int i=0;i<10;i++){
               System.out.println("i="+i);
               
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(LambdaExpression.class.getName()).log(Level.SEVERE, null, ex);
               }
           
           }
       };
        r.run();
        
        
        // Annonymous class 
        Runnable r1=new Runnable() {
           @Override
           public void run() {
               for(int i=0;i<10;i++){
               System.out.println("Annonymous i="+i);
               
               try {
                   Thread.sleep(1000);
               } catch (InterruptedException ex) {
                   Logger.getLogger(LambdaExpression.class.getName()).log(Level.SEVERE, null, ex);
               }
           
           }
           }
       
    };
        r1.run();
        
        
    }
    
}
