
package lab.task;

//2.Write a java class with a parameterized constructor that
//takes two integers as arguments and initializes instances
//variables with those values.
class A{
    A(int a,int b){
    int x=a;
    int y=b;
    System.out.println("x="+x+" "+"y="+y);
    }
}

public class task2 {
    public static void main(String[] args){
        A a=new A(2,2);
        
    }
}
