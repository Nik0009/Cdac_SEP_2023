
//Q1. Write a Java program that declares an array of integers and tries to access an
//element at an index beyond the array’s length. Handle the
//ArrayIndexOutOfBoundsException by providing a meaningful message.


public class TaskNo1 {

    int a[]={1,2,3};
    void addEle(){
        try {
        a[4]=120;
        }
        catch(ArrayIndexOutOfBoundsException e){
            //System.out.println(e.getMessage());
            System.out.println("error");
        }
    }
    public static void main(String[] args) {
        TaskNo1 t=new TaskNo1();
        t.addEle();
    }
    
}
