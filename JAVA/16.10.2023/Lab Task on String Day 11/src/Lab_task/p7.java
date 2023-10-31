
package Lab_task;

//7.Create a program to check if a given string is empty or null.


public class p7 {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.isEmpty();
    }

    public static void main(String[] args) {
        String str1 = null;
        String str2 = "";
        String str3 = "Hello, World!";
        
        System.out.println("String 1 is empty or null: " + isNullOrEmpty(str1));
        System.out.println("String 2 is empty or null: " + isNullOrEmpty(str2));
        System.out.println("String 3 is empty or null: " + isNullOrEmpty(str3));
    }
}

