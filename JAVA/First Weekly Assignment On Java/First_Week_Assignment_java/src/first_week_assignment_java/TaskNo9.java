package first_week_assignment_java;

//9.Write a java program to display your initials on the screen in block letters as shown. For
//example the name Tapan Kumar.
//    TTTTTTTT            K   K
//       T                K  K
//       T                K K
//       T                K
//       T                K K
//       T               K  K
//       T               K   K



public class TaskNo9 {

    public static void main(String[] args) {
        
        System.out.println("Initials Of My Name:-");

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j) {
                    System.out.print("N");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        System.out.println();

        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || (i == j && j <= 4) || (i + j == 8 && j >= 4)) {
                    System.out.print("M");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
