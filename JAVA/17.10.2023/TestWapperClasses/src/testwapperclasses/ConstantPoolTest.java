
package testwapperclasses;


public class ConstantPoolTest {
    
    public static void main(String[] args){
        
        // for integer family -128 to 127 
//        Byte b1=Byte.valueOf("50");
//        Byte b2=Byte.valueOf("50");

//        Short b1=Short.valueOf("1");
//        Short b2=Short.valueOf("1");
        

//        Boolean b1=Boolean.valueOf("false");
//        Boolean b2=Boolean.valueOf("false");

           

//        Float b1=Float.valueOf("12.23");
//        Float b2=Float.valueOf("12.23");
        


        // range of character for constant pool '\u0000' to '\u007f'
        
       
        Character b1=Character.valueOf('A'); 
        Character b2=Character.valueOf('A');

         System.out.println('\u0041');       // printing unicode vaule of 'A'
         System.out.println('\u0950');
//         
//        
//        Character b1=Character.valueOf('\u0950'); 
//        Character b2=Character.valueOf('\u0950');


//        Integer b1=Integer.valueOf("12");
//        Integer b2=Integer.valueOf("12");


//        Float b1=Float.valueOf("1.5657");
//        Float b2=Float.valueOf("1.5657");


//        Double b1=Double.valueOf("12.22222");
//        Double b2=Double.valueOf("12.22222");
        
        System.out.println(b1==b2);
        
    }
}
