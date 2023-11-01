package Day_18_Lab_Task_On_Collection;

//Q1. .Write a java program to Create a collection of Employee class and sort
//objects using comparable and comparator interfaces.


import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;



// comparable interfaces
class Employee implements Comparable<Employee> {

    private int id;
    private String name;
    private String depart;

    public Employee(int id, String name, String depart) {
        this.id = id;
        this.name = name;
        this.depart = depart;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", depart=" + depart + '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepart() {
        return depart;
    }

    @Override
    public int compareTo(Employee o) {
        return this.getId() - o.getId();
    }

}

public class taskNo1 {

    public static void main(String[] args) {
        Vector<Employee> v = new Vector<>();

        Employee e1 = new Employee(101, "suraj", "sales");
        Employee e2 = new Employee(105, "raj", "pm1");
        Employee e3 = new Employee(103, "ramu", "finaces");
        Employee e4 = new Employee(111, "milind", "pm6");
        Employee e5 = new Employee(109, "ganesh", "pm7");

        v.add(e1);
        v.add(e2);
        v.add(e3);
        v.add(e4);
        v.add(e5);
        
       // Collections.sort(v);
       
       EmployeeSortingByName esbn=new EmployeeSortingByName();
       Collections.sort(v, esbn);

        Iterator<Employee> it=v.iterator();
        while(it.hasNext()){

                
              Employee e=it.next();
              System.out.println("id:"+e.getId()+" Name:"+e.getName()+" Department:"+e.getDepart());
        }

    }
}
