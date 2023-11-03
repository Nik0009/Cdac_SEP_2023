
package Sorting;


public class BubbleSort {
    public int[] bubbleSort(int a[],int size){
        for(int i=0;i<size-1;i++)
        {
            for(int j=0;j<size-1-i;j++)
            {
                if(a[j]>a[j+1])
                    swap(a,j,j+1);
            }
        }
        return  a;
        
    } 
     private void swap(int[] a, int j, int i) {
         int temp=a[i];
         a[i]=a[j];
         a[j]=temp;
    }
     
    public static void main(String[] args) {
        int arr[]={22,1,10,3};
        int s=arr.length;
        BubbleSort o=new BubbleSort();
        o.bubbleSort(arr, s);
        for(int i:arr){
            System.out.print(i+" ");
        }
    }

}
