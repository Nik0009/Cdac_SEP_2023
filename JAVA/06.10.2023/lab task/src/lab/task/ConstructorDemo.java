
package lab.task;

class Test{
    int a;
    public Test(){
        a=10;
        //System.out.println(a);
    }
     public Test(int x){
        a=x;
       // System.out.println(a);
    }
    
}

public class ConstructorDemo {
    
//    ConstructorDemo(){
//        int a;
//        System.out.println("calling in main class ");
//}
    
    public static void main(String[] args){
//        ConstructorDemo c=new ConstructorDemo();
        
        
        Test t=new Test();
       // System.out.print(a);
        Test t1=new Test(500);
       System.out.println("a="+t.a);
       System.out.println("a="+t1.a);
       
    
    }
}
