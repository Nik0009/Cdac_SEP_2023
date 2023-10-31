
package methodOverriding;

class Animal{
        void anilmalSound(){
            System.out.println("Generic Animal Sound");
        }
}

class Dog extends Animal{
        void anilmalSound(){
            System.out.println("Dog Barks....");
        }
}

class Cat extends Animal{
        void anilmalSound(){
            System.out.println("Meow....");
        }
}

public class MethodOverriding {
    public static void main(String [] args){
//        Dog d=new Dog();
//        d.anilmalSound();
//        
//        Cat c=new Cat();
//        c.anilmalSound();
        
//        Animal a=new Animal();
//        a.anilmalSound();

           
        Animal a;
        a=new Animal();
        a.anilmalSound();
        
         a=new Dog();
        a.anilmalSound();
        
         a=new Cat();
        a.anilmalSound();
    }
 
}
