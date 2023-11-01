
package first_week_assignment_java;

// 10.Create an array of integers and initialize it with some values.
// i)Calculate the sum and average of the array elements.
// ii)Find the maximum and minimum values in the array.
// iii)Print the results.
     
        
public class TaskNo10 {
    
    static void sumNAvgOfArray(int a[]){
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
         System.out.println("sum of array="+sum);
         int avg=sum/(a.length);
         System.out.println("avrage of array="+avg);
         
    }
    
    static void maxNmin(int a[]){
        int min=a[0],max=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                min=a[i];  
            }
            
            if(a[i]>0){
                max=a[i];  
            }
            
        }
        System.out.println("max element in array :"+min);
        System.out.println("max element in array ::"+max);
    }
    
    public static void main(String[] args){
        int a[]={1,3,2,4,5};
        sumNAvgOfArray(a);
        maxNmin(a);
    }
}
