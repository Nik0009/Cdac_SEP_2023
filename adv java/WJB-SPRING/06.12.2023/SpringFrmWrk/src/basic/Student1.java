
package basic;


public class Student1 {
    private int ID;
    private String Name;
    
    private Address addr;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setAddr(Address addr) {
        this.addr = addr;
    }

    @Override
    public String toString() {
        return "Student1{" + "ID=" + ID + ", Name=" + Name + ", addr=" + addr + '}';
    }

   
    
    
    
}
