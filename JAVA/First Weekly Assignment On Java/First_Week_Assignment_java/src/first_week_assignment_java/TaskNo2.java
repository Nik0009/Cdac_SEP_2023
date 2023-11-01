
package first_week_assignment_java;

import java.util.Scanner;


//2. Write a program in java to create a class name studinfo accept the student
// information by the member method getdata and inherit it in the base class name marks create
// method to get marks in derived class and calculate the percentage and display the complete
// information of student do this for three students


class studinfo {
    String name;
    int roll_no;
    
    
    
    
    void getdata(){
            Scanner sc=new Scanner(System.in);
            System.out.println("enter name of student:");
            name=sc.nextLine();
            System.out.println("enter roll no of student:");
            roll_no=sc.nextInt();
            
    }
    
}

class marks extends studinfo{
    int m1,m2,m3;
    
    void getmarks(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject-1 of student:");
        m1=sc.nextInt();
        
        System.out.println("enter marks of subject-2 of student:");
        m2=sc.nextInt();
        
        System.out.println("enter marks of subject-3 of student:");
        m3=sc.nextInt();
    
    }
    
    float CalPersentage(){
        
        float sum=m1+m2+m3;
        return sum/3;
        
    }
    
    void display(){
        System.out.println("Student information :");
        System.out.println("Student roll no :"+roll_no);
        System.out.println("Student name :"+name);
        System.out.println("Student marks in subject-1 :"+m1);
        System.out.println("Student marks in subject-2 :"+m2);
        System.out.println("Student marks in subject-3 :"+m3);
        System.out.println("Student percentage :"+CalPersentage());
        
    }
    
}


public class TaskNo2 {
    public static void main(String[] args){
//        marks m1=new marks();
//        m1.getdata();
//        m1.getmarks();
//        m1.display();
//        
//        marks m2=new marks();
//        m2.getdata();
//        m2.getmarks();
//        m2.display();
//        
//        
//        marks m3=new marks();
//        m3.getdata();
//        m3.getmarks();
//        m3.display();

        marks [] s=new marks[3];
        for(int i=0;i<3;i++){
            System.out.println("Enter information for student " + (i + 1));
            s[i] = new marks();
            s[i].getdata();
            s[i].getmarks();
        }
        
         System.out.println("Student Information:");
        for (int i = 0; i < 3; i++) {
            s[i].display();
            System.out.println("------------");
        }


    
    }
}
