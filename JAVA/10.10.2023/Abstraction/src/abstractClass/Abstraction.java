
package abstractClass;

import java.util.Scanner;

abstract class LivingThing{
     void eye (){
     System.out.println("two eye");
     }
     void mouth(){
     System.out.println("one mouth");
     };
       abstract void legs();
    
}

class Human extends LivingThing{

    @Override
    void legs() {
    System.out.println("two legs");
    }

}

class Animal extends LivingThing{
      @Override
    void legs() {
    System.out.println("four legs");
    }
}


public class Abstraction {
    
    static void showProperty(LivingThing t){
       
       t.eye();
       t.mouth();
       t.legs();
        
    }
    
    public static void main(String[] args) {
//        LivingThing it;
//        System.out.println("property of human:");
//        it=new Human();
//        it.eye();
//        it.mouth();
//        it.legs();
//        System.out.println();
//        System.out.println("property of Animal:");
//        it=new Animal();
//        it.eye();
//        it.mouth();
//        it.legs();
          
          Scanner sc=new Scanner(System.in);
          String option=sc.nextLine();
          
          if(option.equals(new Human())){
          
          System.out.println("");
          }

          


    }
    
}
