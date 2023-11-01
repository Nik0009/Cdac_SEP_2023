//9.Write a java program to display your initials on the screen in block letters as shown. For
//example the name Tapan Kumar.
//    TTTTTTTT            K   K
//       T                K  K
//       T                K K
//       T                K
//       T                K K
//       T               K  K
//       T               K   K

public class tp{

    
    public static void main(String[] args) {
        
        int i,j;
        for (i = 1; i < 5; i++) {
                   for ( j = i; j <2;j++ ) {
                System.out.print("N");          
        } 
         
        }
         for ( j = 2; j <=5;j++ ) {
                System.out.print(" ");          
        }
            for ( j = 5; j <6;j++ ) {
                System.out.print("N");          
        }
        System.out.println();
        
         for (i = 1; i < 5; i++) {
                   for ( j = i; j <2;j++ ) {
                System.out.print("N");          
        } 
         
        }
         for ( j = 2; j <=5;j++ ) {
                System.out.print(" ");          
        }
            for ( j = 5; j <6;j++ ) {
                System.out.print("N");          
        }
        
    }
}