
package pattern;

import java.util.Scanner;

public class TrianglePattern {
    
    
    void equilateralTrianle(){
        for(int i=0;i<5;i++){
            for(int j=4;j>i;j--){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print("* ");
            }
           System.out.println(" "); 
        }
        
    }
    
    void DynamicEquilateralTrianle(){
        Scanner sc=new Scanner(System.in);
        int  size;
        System.out.println("Enter size of Rows:");
        size=sc.nextInt();
        
        for(int i=0;i<size;i++){
            for(int j=4;j>i;j--){
            System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
            System.out.print("* ");
            }
           System.out.println(" "); 
        }
        
    }
    
    
    
    public static void main(String a[]){
    TrianglePattern t=new TrianglePattern();
    t.DynamicEquilateralTrianle();
    t.equilateralTrianle();

    }
    
}
