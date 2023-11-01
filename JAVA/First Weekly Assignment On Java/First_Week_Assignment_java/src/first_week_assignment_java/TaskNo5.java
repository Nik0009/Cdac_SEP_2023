
package first_week_assignment_java;

// 5.Write a Java program to demonstrate Upcasting Vs Downcasting


class A{
    void print(){
        System.out.println("A is running..");
    }

    
}

class B extends A{
    @Override
    void print(){
        System.out.println("B is running..");
    }
    void show(){
        System.out.println("show() is running..");
    }
}

public class TaskNo5 {
    public static void main(String[] args){
        
        // upcasting
        A a=new B();
        a.print();
        //a.show();
        
        
        // downcasting
        B b=(B)a;
        b.print();
        b.show();
        
    }
}
