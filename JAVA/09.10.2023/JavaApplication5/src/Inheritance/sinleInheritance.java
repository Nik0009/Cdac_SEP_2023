
package Inheritance;

class parentClass{
    int a=10;
    void show(){
        System.out.println("a"+a);
    }

};
class childClass extends parentClass{

    int b=30;
    void show1(){
        System.out.println("b="+b);
    }
};

public class sinleInheritance {
    
    public static void main(String [] args){
        
//        parentClass p=new parentClass();
//        System.out.println(p.a);
//        p.show();
//        
//        childClass c=new childClass();
//        System.out.println(c.b);
//        c.show();


          childClass c=new childClass();
          c.show();
          c.show1();
    }
}
