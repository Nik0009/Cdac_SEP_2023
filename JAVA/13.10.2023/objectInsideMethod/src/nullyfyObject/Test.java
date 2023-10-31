
package nullyfyObject;

public class Test {

    protected void finalize(){
        System.out.println("object is destroyed");
    
    }
    
     public static void main(String [] args){
         Test t1=new Test();
         t1=null;
         System.gc();
     
     }
    
}
