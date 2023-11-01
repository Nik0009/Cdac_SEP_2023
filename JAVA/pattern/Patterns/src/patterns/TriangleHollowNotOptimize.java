
package patterns;

public class TriangleHollowNotOptimize {

   

    public static void main(String[] args) {
       
        //int row, space, i, col, j ,m=4;

//        for (row = 1; row <= m; row++) {
//            for (space = m; space > row; space--) {
//                System.out.print(" ");
//            }
//            for (col = 1; col <= m; col++) {
//                if (col == 4|| row == 4) {
//                    System.out.print("* ");
//                }
//                
//            }
//             for(i=1;i<=1;i++){
//                if(row==3 || col==3){
//                System.out.print(" ");
//                }
//                 if(row==3 || col==3){
//                System.out.print(" *");
//                }
//            }
//            
//            for(j=1;j<row;j++){
//                if(row==2 || col==2){
//                System.out.print("*");
//                }
//            }
//            System.out.println("");
//        }
            int m=4,n=7;
           for(int i=1;i<=4;i++){
               
                for(int j=m-1;j>=i;j--){
                   System.out.print(" ");
               }
               
               for(int j=1;j<=7;j++){
                   if((i==1 && j==4))
                   System.out.print("*");
                    if((i==2 && (j==3 || j==5)))
                   System.out.print("* ");
                    if((i==3 && (j==2 || j==6)))
                   System.out.print("*   ");
                     if((i==4 ))
                   System.out.print("*");
               }
               System.out.println(" ");
           }




    }
}
