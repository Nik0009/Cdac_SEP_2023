package first_week_assignment_java;


// 1.Build a class which has references to other classes. Instantiate these reference variables and invoke instance methods.

class A{
    void methodA(){
        System.out.println("this is method of class A.");
    }
}

class B{
    void methodB(){
        System.out.println("this is method of class B.");
    }
}

class C{
    private A a;
    private B b;
    
    C(){
        a=new A();
        b=new B();
    }
    void cmethodToCallaNb(){
        a.methodA();
        b.methodB();
    }
}

public class TaskNo1 {
    public static void main(String[] args){
        C c=new C();
        c.cmethodToCallaNb();
    }
    
}



