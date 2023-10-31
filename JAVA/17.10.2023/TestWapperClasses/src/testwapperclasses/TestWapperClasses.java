
package testwapperclasses;


public class TestWapperClasses {
    
    public static void main(String[] args) {
        
        int x=10;
        /*
        Integer i=new Integer(x); // boxing
        
        int a=i.intValue(); //unboxing
        
         System.out.println("Prinitive x="+x);
        System.out.println("Reference i="+i);
        
        */
        
        Integer i=x; // autoboxing
        int a=i;    // autounboxing
        
        // String to corresponding numeric value
        String age="25";
        int age1=Integer.parseInt(age);
        
        
        
        System.out.println(age1+5);
        
        
    }
    
}
