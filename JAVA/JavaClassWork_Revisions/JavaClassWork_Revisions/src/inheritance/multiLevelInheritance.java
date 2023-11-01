
package inheritance;

class monkey{
    void eye(){
        System.out.println("monkey has two eye");
    }
    
}
class human extends monkey{
    void legs(){
        System.out.println("human has two legs");
    }
}
class cat extends human{
    void speak(){
        System.out.println("cat not speak..cat only says meaow..");
    }
}

public class multiLevelInheritance {
    public static void main(String [] args){
        cat c=new cat();
        c.eye();
        c.legs();
        c.speak();
    }
}
