//Day7_LabTask_Java

 /*1.Create an Array of Employee class and initialize array elements with different
employee objects.
2.Write a Java program to create an abstract class Person with abstract methods
eat() and exercise(). Create subclasses Athlete and LazyPerson that extend the
Person class and implement the respective methods to describe how each
person eats and exercises.
 */

//2. Solution:
/*Submitted by - Vaibhav Verulkar*/

package Day7_Labtask;
abstract class Person {

    abstract void eat();

    abstract void exercise();
}

class Athlete extends Person {

    @Override
    void exercise() {
        System.out.println("Athelte must have do daily exersize.");
    }

    @Override
    void eat() {
        System.out.println("Athlete eat only dieting kind of food.");
    }

}

class LazyPerson extends Person {

    @Override
    void exercise() {
        System.out.println("Lazy Person lazy to do daily exercise.");
    }

    @Override
    void eat() {
        System.out.println("Lazy Person eat any kind of food.");
    }

}

public class Day7_lab_Task {

    public static void main(String[] args) {

        Person athlete = new Athlete();
        athlete.exercise();
        athlete.eat();

        Person lazyperson = new LazyPerson();
        lazyperson.exercise();
        lazyperson.eat();

    }
}
