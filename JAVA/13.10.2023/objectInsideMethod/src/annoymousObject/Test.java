
package annoymousObject;


public class Test {
    
     protected void finalize(){
        System.out.println("object is destroyed");
    
    }
     
    public static void main(String [] args){
        new Test();
        System.gc();
    
    }
}
