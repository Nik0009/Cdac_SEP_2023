package patterns;


public class Swastik {
    public static void main(String [] args){
        int n=7;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
               if(i<4 && j==1){
                   System.out.print("*");
               } 
               
//               if(i==4 ){
//                   if(j<4)
//               System.out.print("* ");
//               }
               if(j==5){
                   for(int k=1;k<7;k++){
//                       if(j==4 || i==4){}
//                       else
                         
                            System.out.print(" ");
                   }
//                   if(j==4 && i==4){}
//                   else
                   System.out.print("*");
               }
               
               
               
            }
            System.out.println("");
        }
    
    }
    
}

//
//public class Swastik {
//    public static void main(String [] args){
//        
//       int n=7;                 // odd
//       int mid=n/2+1;           //centre point
//       int i,j;
//       for(i=1;i<=n;i++){
//           for( j=1;j<n;j++){
//                if(i==mid || j==mid || (i==1 && j>=mid)|| 
//                        (j==1 && i<=mid)||(i==n && j<=mid)|| 
//                        (j==n && i>=mid)){
//                    System.out.print("* ");  // ws after *
//                }
//                else
//                {
//                    System.out.print("  "); //2 ws
//                }
//           }
//       System.out.println(" ");
//       }
//       
//    
//    }
//    
//}
//public class Swastik {
//    public static void main(String [] args){
//        
//      
//       int i,j;
//       for(i=1;i<=6;i++){
//           for( j=1;j<=6;j++){
//                if((j==3 && i>=0)||(i==3 && j>=0)||(j==0&&i<=2)||(i==0&&j>=4)||(i==6&&j>=2)||(j==6&&i>=4)){
//                    System.out.print("*");
//                }
//                else
//                {
//                    System.out.print(" "); 
//                }
//           }
//       System.out.println(" ");
//       }
//       
//    
//    }
//    
//}

















