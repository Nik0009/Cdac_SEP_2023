
package lab.task;

class demo{
    demo(){
    System.out.println("this is default constructor.");
    }
    
    demo(int a){
        int x=a;
       
        System.out.println("this is Parameterize constructor.");
        System.out.println("a="+x);
    }
    
    demo(int a,int b){
        int x=a;
        int y=b;
        System.out.println("sum="+(x+b));
    }
    
}

public class constructor1 {
    
    public static void main(String a[]){
    
    demo d=new demo();
    demo d1=new demo(3);
    demo d2=new demo(3,5);
    }
}
