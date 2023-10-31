
package exceptionhandling;


public class TestThrows {
    int a=10;
    int b=0;
    
    void show()throws Exception {
         System.out.println(a/b);
         Class.forName(" ");
    }
    void display(){
        System.out.println("display");
    }
     void test(){
        System.out.println("test");
        display();
    }
}
