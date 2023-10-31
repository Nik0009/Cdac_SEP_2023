
package Inheritance;

class GrandParent{
int x=100;
void show(){
    System.out.println(x);
}

}

class Parent extends GrandParent{
    int y=1000;
void show1(){
    System.out.println(y);
}
}

class Child extends Parent{
    int z=10000;
void show2(){
    System.out.println(z);
}
}

public class multilevel {
     public static void main(String [] args){
     Child c=new Child();
     c.show();
     c.show1();
     c.show2();
     
     }
}
