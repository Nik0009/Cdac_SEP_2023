
package day_22_lab_task_on_generics;

//2.Write a generic method to exchange the positions of two different elements in an
//array.

import java.util.Arrays;



public class TaskNo2 {
    
    public static <E>void swap(E arr[], int a,int b){
        E temp;
        temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
        
    }
    
    
    public static void main(String[] args) {
        Integer a[]={1,2,3,4,5};
        swap(a,0,1);
       // System.out.println(Arrays.toString(a));
        for(Integer i:a)
            System.out.println(i);
       

    }
}
