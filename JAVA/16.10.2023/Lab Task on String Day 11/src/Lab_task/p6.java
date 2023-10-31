
package Lab_task;

//6.Write a program to remove all the spaces from a given string.


public class p6 {
    public static String removeSpaces(String str) {
        return str.replaceAll(" ", "");
    }

    public static void main(String[] args) {
        String input = "This is a test string with spaces";
        String withoutSpaces = removeSpaces(input);
        System.out.println("String without spaces: " + withoutSpaces);
    }
}

