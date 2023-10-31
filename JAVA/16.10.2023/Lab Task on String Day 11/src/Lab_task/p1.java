
package Lab_task;

// 1.Create MyString class and perform different string manipulation methods.


public class p1 {
    private String value;

    public p1(String value) {
        this.value = value;
    }
    public String toUpperCase() {
        return value.toUpperCase();
    }

    public String toLowerCase() {
        return value.toLowerCase();
    }

    public int length() {
        return value.length();
    }

    public String reverse() {
        StringBuilder reversed = new StringBuilder(value);
        return reversed.reverse().toString();
    }

    public String removeSpaces() {
        return value.replace(" ", "");
    }
    
    public static void main(String [] args){
        p1 o=new p1("nikhil mowade");
        System.out.println("uppper-case:"+o.toUpperCase());
        System.out.println("lower-case:"+o.toLowerCase());
        System.out.println("length:"+o.length());
        System.out.println("reverse:"+o.reverse());
        System.out.println("remove spaces:"+o.removeSpaces());
    
    }
}



