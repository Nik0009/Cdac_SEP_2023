package basic;

public class Student {
    private int sID;
    private String sName;

    public void setsID(int sID) {
        this.sID = sID;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    @Override
    public String toString() {
        return "Student{" + "sID=" + sID + ", sName=" + sName + '}';
    }
}
