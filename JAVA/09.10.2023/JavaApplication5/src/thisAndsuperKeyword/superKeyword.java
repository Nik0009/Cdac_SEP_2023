
package thisAndsuperKeyword;

class Animal{
    int a;
    
     public Animal() {
        
    }

    public Animal(int a) {
        this.a = a;
    }
    
    
    
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
    
//    int a=1100;
//    public Cat(){
//    
//    }
        void anilmalSound(){
            System.out.println("Meow....");
            super.anilmalSound();
        }
        
}

public class superKeyword{
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
