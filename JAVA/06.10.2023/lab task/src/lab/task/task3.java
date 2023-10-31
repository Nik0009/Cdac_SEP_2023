
package lab.task;

//3.Create a class with multiple constructors, including a
//default constructor and a parameterized constructor.
//Demonstrate how to use each constructor

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

public class task3 {
      public static void main(String a[]){
    
    demo d=new demo();
    demo d1=new demo(3);
    demo d2=new demo(3,5);
    }
}
