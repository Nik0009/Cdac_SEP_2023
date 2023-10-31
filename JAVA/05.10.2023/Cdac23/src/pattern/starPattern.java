
package pattern;

import java.util.Scanner;

public class starPattern {
    
    void DynamicEquilateralTrianle(){
        Scanner sc=new Scanner(System.in);
        int  size;
        System.out.println("Enter size of Rows:");
        size=sc.nextInt();
        
        for(int i=0;i<size;i++){
            for(int j=size;j>i;j--){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print("* ");
            }
           System.out.println(" "); 
        }     
        
         for(int i=1;i<size;i++){
            for(int j=0;j<=i;j++){
            System.out.print(" ");
            }
            for(int j=size;j>i;j--){
            System.out.print("* ");
            
            }
           System.out.println(" "); 
        }
         
    }
    
    public static void main(String a[]){
        starPattern s=new starPattern();
        s.DynamicEquilateralTrianle();
    }  
}
 
