
package Interfaces;


public class TestInterface {
    public static void main(String [] args){
            
        StudentInterface si;
        si=new studentImplimentation();
        si.showName("xyz");
        si.showAge(23);
        si.course();
        StudentInterface.institute();
    
    }
}
