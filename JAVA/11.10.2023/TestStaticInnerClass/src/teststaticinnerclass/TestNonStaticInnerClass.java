
package teststaticinnerclass;

class Outer {
    int x=100;
    class Inner{
        
        int y=200;
        
        void display(){
            System.out.println("I am in non-static inner class having "+"x="+x+"y="+y);
        
        
        }
    
    
    }

}
public class TestNonStaticInnerClass {
    
    public static void main(String[] args){
        
        Outer o=new Outer();
        Outer.Inner obj=o.new Inner();
        obj.display();
    
    }
}
