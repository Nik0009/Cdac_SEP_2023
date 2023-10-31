package pattern;

import java.util.Scanner;

public class hollowPattern {
    
    void hollow(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter size of pattern");
    int size=sc.nextInt();
    char c='A';
    for(int i=0;i<size;i++){
//        for(int j=size;j>0;j--){
//        System.out.print(" ");
//        }
         for(int j=size-1;j>i;j--){
        System.out.print(" ");
        }
          for(int j=0;j<=i;j++){
     //   System.out.print(" "+(size-i-1));
        if(j==0||j==1)
        System.out.print(" "+c);
        else if(i==size-1||i%5==0)
        System.out.print(" "+c);
        else
        System.out.print(" ");
        }
        c++;
        System.out.println(""); 
    }
    }
   
    public static void main(String a[]){
    
        hollowPattern h=new hollowPattern();
        h.hollow();
    
    }
}
