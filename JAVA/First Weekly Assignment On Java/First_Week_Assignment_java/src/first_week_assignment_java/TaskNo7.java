
package first_week_assignment_java;

//7.Write a Java program to demonstrate multiple inner classes(Member,Local and Anonymous
//Inner class).


class parent{
        void parentMethod(){
            System.out.println("parent class method calling..");
        }
}



class outer{
   int x=10;
   
   // static inner class
    static class inner{
        int a=10;
        
         void innerMthod(){
            outer o=new outer();
            System.out.println(o.x+a);
        }
    }
    
    
    // non-static inner class 
    class innerNonStatic{
        int b=10;
        
        void innerMthod1(){
            System.out.println(x+b);
    }
    }
    
    // Annonymous class
    parent p=new parent(){
    @Override
    public void parentMethod(){
    System.out.println("Annonymous class method calling..");
    }
    };

}

public class TaskNo7 {
    public static void main(String [] args){
        
        // static inner class object calling
        outer.inner i=new outer.inner();
        i.innerMthod();
        
        // non-static inner class object calling
        outer o=new outer();
        outer.innerNonStatic i1=o.new innerNonStatic();
        i1.innerMthod1();
        
        // Annonymous inner class object calling
        outer o1=new outer();
        o1.p.parentMethod();
    }
}
