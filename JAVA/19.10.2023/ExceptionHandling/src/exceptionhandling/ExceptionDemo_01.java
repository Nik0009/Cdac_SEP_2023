package exceptionhandling;

public class ExceptionDemo_01 {

    int a=10;
    int b=0;
    int arr[]={1,2,3};
    
    void display(){
        System.out.println("Display");
    }
    void show(){
        try{
            System.out.println("C");
            arr[5]=1222;
            System.out.println(a/b);
            
            
         }
         catch(ArrayIndexOutOfBoundsException |ArithmeticException e){
            System.out.println(e.getMessage());
        }
        
//        
//        catch(ArithmeticException e){
//            System.out.println(e.getMessage());
//        }
        
        
//        catch(Exception e){
//           System.out.println(e.getMessage());
//        }
//         catch(Throwable e){
//           System.out.println(e.getMessage());
//        }
        finally{
            System.out.println("D"); 
        }
    }
    
    public static void main(String[] args) {
        System.out.println("A");
        ExceptionDemo_01 obj=new ExceptionDemo_01();
        System.out.println("B");
        obj.show();
        System.out.println("E");
        obj.display();
    }
    
}
