package collection;
public class Student implements Comparable<Student>{
    private int id;
    private String name;
    private int age;

    public Student(int id,String name, int age) {
        this.id=id;
        this.name = name;
        this.age = age;
    }
@Override
    public int compareTo(Student o) {
       return this.id-o.id;
    }
    @Override
    public String toString() {
        return "Id : "+id+", Name : "+name+", Age : "+age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    public int getId(){
    return id;
    }

    
    
}
