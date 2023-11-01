
package first_week_assignment_java;


// 4.Write a Java program to create an abstract class GeometricShape with abstract methods area()
// and perimeter(). Create subclasses Triangle and Rectangle that extend the GeometricShape
// class and implement the respective methods to calculate the area and perimeter of each shape.

abstract class GeometricShape{
   abstract float area();
   abstract float perimeter();
}

class Triangle extends GeometricShape{
    float b,h,s1,s2,s3;
    
    Triangle(float b,float h,float s1,float s2,float s3){
        this.b=b;
        this.h=h;
        this.s1=s1;
        this.s2=s2;
        this.s3=s3;
    }
    
    @Override
    float area() {          // (1/2)*(b*h)
        return 0.5f*b*h;
    }

    @Override
    float perimeter() {     // a+b+c
        return s1+s2+s3;
    }
    
}
class Rectangle extends GeometricShape{
    
    float l,w;
    
    Rectangle(float l,float w){
        this.l=l;
        this.w=w;
    }
    
    @Override
    float area() {          // l*w
        return l*w;
    }

    @Override
    float perimeter() {     //2(l+w)
        
        return 2*(l+w);
    }

}

public class TaskNo4 {
    public static void main(String[] args){
        GeometricShape t=new Triangle(12,11,5,6,7);
        System.out.println("Triangle Area: "+ t.area());
       
        System.out.println("Triangle Perimeter: "+t.perimeter());
        
        
        GeometricShape r=new Rectangle(12,12);
        System.out.println("Rectangle Area: "+r.area());
        
        System.out.println("Rectangle Perimeter: "+r.perimeter());
        
    }
}
