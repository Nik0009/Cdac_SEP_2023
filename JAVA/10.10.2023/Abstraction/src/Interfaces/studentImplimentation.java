
package Interfaces;


public class studentImplimentation implements StudentInterface {

    @Override
    public void showName(String name) {
        System.out.println("my name is "+name);
    }

    @Override
    public void showAge(int age) {
        System.out.println("student age is "+age);
    }

    
    
}
