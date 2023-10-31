
package testpackagedemo;

//import static testpackagedemo.pack1.FirstDemo.*; // accessing static method with importing static property

import static testpackagedemo.pack1.FirstDemo.show;

import static java.lang.Math.*;



//import testpackagedemo.pack1.FirstDemo;

//import testpackagedemo.pack1.FirstDemo;
import testpackagedemo.pack2.*;

// import testpackagedemo.pack1.*;

// system will comfuse which class has to run
// import testpackagedemo.pack2.FirstDemo;

public class TestPackageDemo {
    
    public static void main(String[] args) {
    //    FirstDemo fd=new FirstDemo(); // accessing pack1 class 
     //   FirstDemo fd1=new FirstDemo(); // same 
        
     
     // testpackagedemo.pack1.FirstDemo fd=new testpackagedemo.pack1.FirstDemo(); // accessing pack1 class with help of fully collified name of package
   //   testpackagedemo.pack2.FirstDemo fd1=new testpackagedemo.pack2.FirstDemo(); // accessing pack2 class with help of fully collified name of package
      
  // FirstDemo fd=new FirstDemo();
   SeconDemo fd1=new SeconDemo();
   
   
    //  fd.show(); // show () of pack1 has to be public in pack1 if it is not public then it 
     // fd1.show();
      
    //  fd.x; // it is not possble access varible outside pakage with the help of object
    
   // FirstDemo.show(); // accessing static method with class name
    fd1.show1();
    show(); // 
    //System.out.println("sq="+Math.sqrt(25)) ; // math is class present in java.lang package and sqrt is method and we directly access this method with the help of class name
      System.out.println("sq="+sqrt(25)) ; // math is class present in java.lang package and sqrt is method and we directly access this method with the help of static import
    }
    
}
