
package collectionInjection;

import java.util.List;
import java.util.Map;


public class Employee {
    private String empName;
    private List<Integer> phoneNos;
    private Map<String,String> projects;

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public void setPhoneNos(List<Integer> phoneNos) {
        this.phoneNos = phoneNos;
    }

    public void setProjects(Map<String, String> projects) {
        this.projects = projects;
    }

    @Override
    public String toString() {
        return "Employee{" + "empName=" + empName + ", phoneNos=" + phoneNos + ", projects=" + projects + '}';
    }
    
    
    
}
