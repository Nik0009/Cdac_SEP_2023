
package HasARelationship;

class College{
  private String name;
  private Department departs[];

    public College(String name,Department[] departs) {
        this.name = name;
        this.departs = departs;
    }
  
    void collegeDetails(){
        System.out.println("College Details:");
        System.out.println("College name:"+name);
        for(Department d:departs){
            
             System.out.println(d);
        }
    }
}

class Department{
    private String name;
    private int capaciy;

    public Department(String name, int capaciy) {
        this.name = name;
        this.capaciy = capaciy;
    }

    @Override
    public String toString() {
        return "Department{" + "name=" + name + ", capaciy=" + capaciy + '}';
    }
    
}


public class TestAgregation {
    public static void main(String[] args){
        
        Department dept[]={new Department("It",500),new Department("mechnical",300)};
        Department dept1[]={new Department("It",500),new Department("mechnical",300)};
        
        College c=new College("ycc",dept);
        College c1=new College("ramdev baba",dept1);
        c.collegeDetails();
       System.out.println("**********************************************");
       c1.collegeDetails();
    }
}
