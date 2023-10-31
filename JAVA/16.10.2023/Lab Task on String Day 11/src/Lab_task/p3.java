
package Lab_task;

//3.Write a program to find the common characters between two strings.

public class p3 {
    public static String findCommonCharacters(String str1, String str2) {
        StringBuilder common = new StringBuilder();
        for (char c : str1.toCharArray()) {
            if (str2.contains(String.valueOf(c)) && common.indexOf(String.valueOf(c)) == -1) {
                common.append(c);
            }
        }
        return common.toString();
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String commonChars = findCommonCharacters(str1, str2);
        System.out.println("Common characters: " + commonChars);
    }
}

