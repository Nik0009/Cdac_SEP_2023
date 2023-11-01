public class tp{

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

//        System.out.println();
//
//        for (int i = 1; i <= 7; i++) {
//            for (int j = 1; j <= 7; j++) {
//                if (j == 1 || j == 7 || (i == j && j <= 4) || (i + j == 8 && j >= 4)) {
//                    System.out.print("M");
//                } else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }
    }
}