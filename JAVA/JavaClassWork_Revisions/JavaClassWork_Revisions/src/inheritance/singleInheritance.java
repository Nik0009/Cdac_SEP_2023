
package inheritance;

class Human{
    void hands(){
      System.out.println("human has two hands");
    }
    void legs(){
        System.out.println("human has two legs");
    }
    
}

class monkey extends Human {
   void mhands(){
      System.out.println("monkey has two hands");
    }
    void mlegs(){
        System.out.println("monkey has two legs");
    }
    void hands(){
      System.out.println("human has two hands");
    }

}

public class singleInheritance {
    public static void main(String [] args){
//        Human h=new Human();
//        h.hands();
//        h.legs();
        Human m=new monkey();
        m.hands();
        m.legs();
        
        monkey n=new monkey();
        n.legs();
        n.mhands();
        n.mlegs();
    }
}
