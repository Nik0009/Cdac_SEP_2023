package first_week_assignment_java;


// 3.Write a Java program to create an abstract class Instrument with abstract methods play() and
// tune(). Create subclasses for Piano and Guitar that extend the Instrument class and implement
// the respective methods to play and tune each instrument.

abstract class Instrument{
    abstract void play();
    abstract void tune();

}
class  Piano extends Instrument{

    @Override
    void play() {
        System.out.println("piano playing..");
    }

    @Override
    void tune() {
        System.out.println("piano tuning..");
    }
}

class Guitar extends Instrument{

    @Override
    void play() {
        System.out.println("guitar playing..");
    }

    @Override
    void tune() {
        System.out.println("guitar tuning..");
    }
}

public class TaskNo3 {
    public static void main(String[] args){
        Instrument p=new Piano();
        p.play();
        p.tune();
        
       Instrument g=new Guitar();
        g.play();
        g.tune();
    }
}
