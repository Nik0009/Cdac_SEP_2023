
package Interfaces;

public interface StudentInterface {
    int a=10;  // public static final int a=10;
    
    void showName(String name);    // public abstract void showName();
    void showAge(int age);
    
   default void course(){
       System.out.println("Default Method");
       System.out.println(" ");
       System.out.println("private non-static method "+exam());
    }
   
   static void institute(){
       
       System.out.println("static method of interface");
       System.out.println(" ");
       System.out.println("private static method "+city());
   }
    
   private String exam(){
   return "cet";
   }
   
   private static String city(){
   return "Nagpur";
   }
    
}
