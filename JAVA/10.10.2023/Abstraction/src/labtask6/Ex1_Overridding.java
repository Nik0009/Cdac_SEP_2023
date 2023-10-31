
package labtask6;

class Animal {
    // Public method in the base class
     public void eat() {
        System.out.println("Animal is eating");
    }

    // Protected method in the base class
    protected void sleep() {
        System.out.println("Animal is sleeping");
    }
}

class Dog extends Animal {
    // Overriding the eat() method
    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }

    // Accessing the protected sleep() method from the base class
    public void sleepForAWhile() {
        sleep();
    }
}

public class Ex1_Overridding {
    public static void main(String[] args) {
        // Creating an instance of Dog
        Dog myDog = new Dog();

        // Calling the overridden eat() method of Dog
        myDog.eat();

        // Calling the sleepForAWhile() method, which in turn calls the protected sleep() method
        myDog.sleepForAWhile();
    }
}