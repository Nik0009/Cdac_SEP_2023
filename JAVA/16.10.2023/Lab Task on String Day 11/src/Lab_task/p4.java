
package Lab_task;

//4.Write a Java program to reverse a given string

public class p4 {
    public static String reverse(String str) {
        StringBuilder reversed = new StringBuilder(str);
        return reversed.reverse().toString();
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        String reversedString = reverse(input);
        System.out.println("Reversed string: " + reversedString);
    }
}
