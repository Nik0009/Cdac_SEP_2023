
package inheritance;

class A{
    void showA(){
    System.out.println("A's method calling..");
    }
}
class B extends A{
     void showB(){
    System.out.println("B's method calling..");
    }
}
class C extends A{
     void showC(){
    System.out.println("C's method calling..");
    }
}
class D extends A{
     void showD(){
    System.out.println("D's method calling..");
    }
}

public class hirarchyicalInheritance {
    public static void main(String [] args){
    B b=new B();
    b.showA();
    b.showB();
    
    C c=new C();
    c.showA();
    c.showC();
    
    D d=new D();
    d.showA();
    d.showD();
    
    }
}
