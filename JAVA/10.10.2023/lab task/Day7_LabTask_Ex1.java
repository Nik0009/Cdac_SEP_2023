//Day7_LabTask_Java

/*1.Create an Array of Employee class and initialize array elements with different
employee objects.
 */
// Submitted by - Vaibhav Verulkar
package Day7_Labtask;
//Day7_LabTask_Java

/*1.Create an Array of Employee class and initialize array elements with different
employee objects.
 */
// Submitted by - Vaibhav Verulkar

class Employee {

    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }
}

public class Day7_LabTask_Ex1 {

    public static void main(String[] args) {
        // Creating an array of Employee objects
        Employee[] employees = new Employee[3];

        // Initializing array elements with different Employee objects
        employees[0] = new Employee("John Doe", 101);
        employees[1] = new Employee("Jane Smith", 102);
        employees[2] = new Employee("Bob Johnson", 103);

        // Accessing and printing information about each employee
        for (Employee emp : employees) {
            System.out.println("Employee ID: " + emp.getEmployeeId());
            System.out.println("Employee Name: " + emp.getName());
            System.out.println();
        }
    }
}
