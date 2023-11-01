package javaclasswork_revisions;

//class joker{
//    void show(){
//    System.out.println("hi joker....");
//    }
//} 
// if we not declare class as public then we should not give file name and class name as same.
// and if we declare class as public then we should give file name and class name not same.
// means if we declare class as public then it is mandator to give class_name and file_name same.
//  class JavaClassWork_Revisions1 {
//
//    
//    public static void main(String[] args) {
//       joker j=new joker();
//       j.show();
//     
//}
//}
// and if we declare class as public then we should give file name and class name not same IT GIVES FOLLOWING RUNTIME-EXCEPTION
//  class JavaClassWork_Revisions1 is public, should be declared in a file named JavaClassWork_Revisions1.java
// Exception in thread "main" java.lang.ExceptionInInitializerError
//public class JavaClassWork_Revisions1 {
//
//    
//    public static void main(String[] args) {
//       joker j=new joker();
//       j.show();
//    
//}
//}
//*************************************************************************************************************************************************************************************************************************//
//*************************************************************************************************************************************************************************************************************************//
// 1. FINAL CLASS CANNOT INHERIT FROM CHILD CLASS.
// cannot inherit from final $joker
// CLASS_NAME START WITH $,_ ONLY
//class $joker {
//
//    // FINAL VARIABLE WILL BE CONSTANT
//    final int a = 10;
//    
//    // FINAL VARIBLE CANNOT CHANGE ONCE IT IS INITILIZE
//    
//    // cannot assign a value to final variable z
//   // a=100;
//
//    void jokersJok() {
//        System.out.println("Joker cracks jokes and " + (a) + " peoples has not laught.");
//    }
//}
//
//// 
//class _notLaughtPeoples extends $joker {
//
//    // 2. FINAL METHOD CANNOT OVERRIDE
//    // jokersJoke() in _notLaughtPeoples cannot override jokersJoke() in $joker overridden method is final
//    
//    void jokersJok() {
//
//        System.out.println("Joker cracks jokes and " + (a + 1) + " peoples has not laught.");
//    }
//}
//
//class JavaClassWork_Revisions1 {
//
//    public static void main(String[] args) {
//
////     _notLaughtPeoples nlp=new _notLaughtPeoples();
////     nlp.jokersJoke();
//        $joker j = new $joker();
//    
////        j.a;
////        j.y;
//        j.jokersJok();
//
//    }
//}
//*************************************************************************************************************************************************************************************************************************//
//*************************************************************************************************************************************************************************************************************************//
// WITH OUTER CLASS WE USE DEFALUT AND PUBLIC
// class JavaClassWork_Revisions1 {
//     
//     // IN INNER CLASS WE CAN NOT USE DEFAULT ACCESS-SPECIFIER BUT WE USE PRIVATE,PUBLIC,PROTECTED
//     
//     // modifier default not allowed here 
//
//     default  class jokerAlySmile{
//        void jokersNotHappy(){
//        
//        System.out.println("Joker is not happy.");
//        
//        }
//     }
//    public static void main(String[] args) {
//        // JavaClassWork_Revisions1.jokerAlySmile j=new JavaClassWork_Revisions1.jokerAlySmile();
//        
//        JavaClassWork_Revisions1 j=new JavaClassWork_Revisions1();
//        JavaClassWork_Revisions1.jokerAlySmile jnh=j.new jokerAlySmile(); 
//        jnh.jokersNotHappy();
//    }
//}

//*************************************************************************************************************************************************************************************************************************//
//*************************************************************************************************************************************************************************************************************************//


//class JavaClassWork_Revisions1 {
//
//    int a = 10; // instance variable
//
//    static int b = 200; // static variable
//
//    int main() {
//        int s=232044; // local variable
//        return s;
//    }
//    void show(){
//        System.out.println(a);
//        System.out.println(JavaClassWork_Revisions1.b);
//        int s=main();
//         System.out.println(s);
//    }
//   void  display(){
//       System.out.println(b);
//    }
//
//    public static void main(String[] args) {
//        JavaClassWork_Revisions1 j=new JavaClassWork_Revisions1();
//        JavaClassWork_Revisions1 j1=new JavaClassWork_Revisions1();
//      
//        System.out.println("before assign values to  static variable now b=200 ");
//        j.show();
//        
//        System.out.println("After assign values to  static variable now b=100 ");
//        
//        // WHEN WE CHANGE STATIC VARIABLE VALUE FROM ONE OBJECT IT WILL BE CHANGE/MODIFY FROM ALL OTHERS OBJECT ALSO 
//        j1.b=100;
//        
//        
//        j1.display();
//        j.show();
//    }
//}



//*************************************************************************************************************************************************************************************************************************//

//*************************************************************************************************************************************************************************************************************************//
//
//class JavaClassWork_Revisions1 {
//    int a=10;
// 
//      static public void  main(String[] args) {
//         JavaClassWork_Revisions1 j=new JavaClassWork_Revisions1();
//        System.out.println(j.a);
//    }
//}



//*************************************************************************************************************************************************************************************************************************//

//*************************************************************************************************************************************************************************************************************************//



//class angle{
//    angle(){
//        System.out.println("this is from constructor angle.");
//   }
//    angle(String s){
//        System.out.println("this is from constructor angle where string is "+s);
//    
//    }
//    angle(String a,String b){
//        System.out.println("this is from constructor angle where string is "+a+" "+b);
//    }
//}
//
//class JavaClassWork_Revisions1 {
//    
// 
//      static public void  main(String[] args) {
//        angle agl=new angle();
//        angle ag2=new angle("angle is from heaven");
//        angle ag3=new angle("angle is from heaven","and devil is from hell");
//    }
//}




//*************************************************************************************************************************************************************************************************************************//

//*************************************************************************************************************************************************************************************************************************//

