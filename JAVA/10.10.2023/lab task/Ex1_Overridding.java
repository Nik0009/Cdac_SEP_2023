/*
1.Write a Java program to demonstrate Overriding and Access-Modifiers.
2.Write a Java program to demonstrate that overridden method can be called from sub-class.
3. A person has his money deposited Rs 10000, Rs15000 and Rs2000 in banks-Bank
A, Bank B and Bank C respectively. We have to print the money deposited by him in a
particular bank.
Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three
subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name
'getBalance' which returns the amount deposited in that particular bank. Call the method
'getBalance' by the object of each of the three banks.
*/
/* @author vaibhav */
//1.Write a Java program to demonstrate Overriding and Access-Modifiers.
//Solution:

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

