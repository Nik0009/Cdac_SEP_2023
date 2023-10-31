package teststaticinnerclass;

class Outer {

    int x=10;
    
    static class InnerStatic {
          
        int y=20;
        void show(){
            Outer o=new Outer();
            System.out.println("I am from Static inner class having variable x+y= "+(o.x+y));
        
        }
        
        
    }

}

public class TestStaticInnerClass {

    public static void main(String[] args) {
        
        
        Outer.InnerStatic obj=new Outer.InnerStatic(); // nested class object creation
        obj.show();
        
        
    }

}
