
package Day_18_Lab_Task_On_Collection;

import java.util.Comparator;


public class EmployeeSortingByName implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getName().compareTo(o2.getName());
    }
    
    
}
