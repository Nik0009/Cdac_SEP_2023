
package Inheritance;

class parent{
        int a=10;
        void show(){
        System.out.println(a);
        }
}

class child1 extends parent{
        int b=100;
        void display(){
        System.out.println(b);
        }
}

class child2 extends parent{
        int z=1000;
        void display(){
        System.out.println(z);
        }
}

class child3 extends parent{
        int e=10000;
        void display(){
        System.out.println(e);
        }
}


public class hirarchy {
     public static void main(String [] args){
     
     child1 c1=new child1();
     child2 c2=new child2();
     child3 c3=new child3();
     
     c1.show();
     c1.display();
     
     c2.show();
     c2.display();
     
     c3.show();
     c3.display();
     
     
     
     }
}
