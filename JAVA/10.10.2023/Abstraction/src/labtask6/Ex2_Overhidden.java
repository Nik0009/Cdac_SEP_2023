
package labtask6;


class Animal {
    // Method in the base class
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    // Overriding the makeSound() method
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }

    // New method in the Dog class
    public void play() {
        System.out.println("Dog is playing");
    }

    // Method to demonstrate calling overridden method from subclass
    public void communicate() {
        // Calling the overridden makeSound() method from the base class
        super.makeSound();
    }
}

public class Ex2_Overhidden {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog();

        // Calling overridden method makeSound() from the Dog class
        myDog.makeSound();

        // Calling the new method play() from the Dog class
        myDog.play();

        // Calling the method communicate() to demonstrate calling overridden method from the subclass
        myDog.communicate();
    }
}