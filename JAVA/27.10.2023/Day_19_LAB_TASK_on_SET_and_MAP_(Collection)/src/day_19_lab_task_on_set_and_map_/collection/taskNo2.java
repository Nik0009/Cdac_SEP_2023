
package day_19_lab_task_on_set_and_map_.collection;

//Q2.Write a java program to Create a menu-driven interface for managing

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//student grades. Users can perform the following tasks:
//1. Add students
//2. Update grades
//3. Remove students
//4. View individual grades
//5. List all students and grades
//6. Calculate the average grade for all students.
//Use HashMap to store student names and grades



public class taskNo2 {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println(
                "1. Add students\n" +
                "2. Update grades\n" +
                "3. Remove students\n" +
                "4. View individual grades\n" +
                "5. List all students and grades\n" +
                "6. Calculate the average grade for all students.");
        
        System.out.println("Enter any option from above:");
        int o=sc.nextInt();
        Map<String,Integer> mp=new HashMap<>();
        
        switch(o){
            case 1:
                System.out.println("Enter name of student:");
                String n=sc.nextLine();
                
                System.out.println("Enter grade of student:");
                int g=sc.nextInt();
                
                mp.put(n, g);
               
//                System.out.println("Enter name of student:");
//                String n1=sc.nextLine();
//                System.out.println("Enter grade of student:");
//                String g1=sc.nextLine();
//                mp.put(n1, g1);
                
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                System.out.println("List all students and grades: ");
                for(Map.Entry<String,Integer> entery : mp.entrySet()){
                    String name=entery.getKey();
                    int grade=entery.getValue();
                    System.out.println("Name :"+name+" "+"Grade :"+grade);
                }
                
                break;
            case 6:
                break;
            default:
                System.out.println("please Select Correct Option from Above....!!!!!!");
        }
        
        
        
    }
}



//import java.util.HashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class StudentGradeManager {
//    public static void main(String[] args) {
//        Map<String, Integer> studentGrades = new HashMap<>();
//        Scanner scanner = new Scanner(System.in);
//
//        while (true) {
//            System.out.println("Student Grade Management System");
//            System.out.println("1. Add Student");
//            System.out.println("2. Update Grade");
//            System.out.println("3. Remove Student");
//            System.out.println("4. View Individual Grade");
//            System.out.println("5. List All Students and Grades");
//            System.out.println("6. Calculate Average Grade");
//            System.out.println("7. Exit");
//            System.out.print("Enter your choice: ");
//
//            int choice = scanner.nextInt();
//            scanner.nextLine(); // Consume the newline character
//
//            switch (choice) {
//                case 1:
//                    System.out.print("Enter student name: ");
//                    String name = scanner.nextLine();
//                    System.out.print("Enter grade: ");
//                    int grade = scanner.nextInt();
//                    studentGrades.put(name, grade);
//                    System.out.println("Student added.");
//                    break;
//                case 2:
//                    System.out.print("Enter student name to update grade: ");
//                    String updateName = scanner.nextLine();
//                    if (studentGrades.containsKey(updateName)) {
//                        System.out.print("Enter new grade: ");
//                        int newGrade = scanner.nextInt();
//                        studentGrades.put(updateName, newGrade);
//                        System.out.println("Grade updated.");
//                    } else {
//                        System.out.println("Student not found.");
//                    }
//                    break;
//                case 3:
//                    System.out.print("Enter student name to remove: ");
//                    String removeName = scanner.nextLine();
//                    if (studentGrades.containsKey(removeName)) {
//                        studentGrades.remove(removeName);
//                        System.out.println("Student removed.");
//                    } else {
//                        System.out.println("Student not found.");
//                    }
//                    break;
//                case 4:
//                    System.out.print("Enter student name to view grade: ");
//                    String viewName = scanner.nextLine();
//                    if (studentGrades.containsKey(viewName)) {
//                        int studentGrade = studentGrades.get(viewName);
//                        System.out.println(viewName + "'s grade: " + studentGrade);
//                    } else {
//                        System.out.println("Student not found.");
//                    }
//                    break;
//                case 5:
//                    System.out.println("List of all students and grades:");
//                    for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
//                        System.out.println(entry.getKey() + ": " + entry.getValue());
//                    }
//                    break;
//                case 6:
//                    if (studentGrades.isEmpty()) {
//                        System.out.println("No students to calculate the average grade.");
//                    } else {
//                        double totalGrade = 0;
//                        for (int gradeValue : studentGrades.values()) {
//                            totalGrade += gradeValue;
//                        }
//                        double averageGrade = totalGrade / studentGrades.size();
//                        System.out.println("Average grade for all students: " + averageGrade);
//                    }
//                    break;
//                case 7:
//                    System.out.println("Exiting the program.");
//                    scanner.close();
//                    System.exit(0);
//                default:
//                    System.out.println("Invalid choice. Please enter a valid option.");
//            }
//        }
//    }
//}
