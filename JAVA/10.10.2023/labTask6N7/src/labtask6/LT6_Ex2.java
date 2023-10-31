
package labtask6;


class Animal {
  
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
   
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

   
    public void play() {
        System.out.println("Dog is playing");
    }

  
    public void communicate() {
      
        super.makeSound();
    }
}

public class LT6_Ex2 {
    public static void main(String[] args) {
      
        Dog myDog = new Dog();

        myDog.makeSound();

        myDog.play();

        myDog.communicate();
    }
}

