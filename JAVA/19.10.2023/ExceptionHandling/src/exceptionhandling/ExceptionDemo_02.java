
package exceptionhandling;


public class ExceptionDemo_02 {
    public static void main(String[] args){
        TestThrows t=new TestThrows();
        t.test();
        try{
        t.show();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
