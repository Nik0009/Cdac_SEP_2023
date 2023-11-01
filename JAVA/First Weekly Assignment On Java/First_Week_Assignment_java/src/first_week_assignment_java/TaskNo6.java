
package first_week_assignment_java;

// 6.Write a java program to create a demo application to understand the role of access modifiers.

import java.util.Scanner;

class Modifiers{
    private String name;
    protected int id;
    int age;
    public String collegeName;
    
    Scanner sc = new Scanner(System.in);
    
    private void privateMethod(){
        System.out.println("Name of student: "+name);
        name = sc.nextLine();
    }
    
    protected void protectedMethod(){
        System.out.println("Id of Student: ");
        id = sc.nextInt();
    }
    
     void defaultMethod(){
        System.out.println("Age of Student: ");
        age = sc.nextInt();
    }
     
    public void publicMethod(Scanner o){
        System.out.println("Name of college: ");
        collegeName = o.nextLine();
    }
    
    void display(){
        System.out.println("Studnt Details: ");
        //System.out.println("Name of student: "+name);
        System.out.println("Id of Student:: "+id);
        System.out.println("Age of Student: "+age);
        System.out.println("Name of college: "+collegeName);
        
    }
}
public class TaskNo6 {
    public static void main(String[] args) {
        Modifiers m = new Modifiers();
       // m.privateMethod();
        m.protectedMethod();
        m.defaultMethod();
        Scanner obj=new Scanner(System.in);
        m.publicMethod(obj);
        m.display();
        
    }
    
}