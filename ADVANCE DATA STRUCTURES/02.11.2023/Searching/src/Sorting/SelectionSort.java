
package Sorting;


public class SelectionSort {
    
    public int[] selectionSort(int a[],int size){
        for(int i=0;i<size-1;i++){
            for(int j=i+1;j<size;j++){
                if(a[i]>a[j])
                    swap(a,i,j);              
            }
        }
       return a;
    }
    
    private void swap(int[] a, int i, int j) {
          
            
                int temp=a[i];
                a[i]=a[j];
                a[j]=temp;              
    }
    
    public static void main(String[] args) {
        int arr[]={9, 2, 5, 6, 1, 3, 7, 4, 8};
        int size=arr.length;
        
        SelectionSort o=new SelectionSort();
        
        o.selectionSort(arr, size);
        for(int i:arr)
                System.out.print(i+" ");
        
    }
}





//public class SelectionSort {
//
//    public int[] selectionSort(int a[], int size) {
//        for (int i = 0; i < size - 1; i++) {
//            for (int j = i + 1; j < size; j++) {
//                if (a[i] > a[j]) {
//                    swap(a, i, j);
//                }
//            }
//        }
//        return a;
//    }
//
//    private void swap(int[] a, int i, int j) {
//        int temp = a[i];
//        a[i] = a[j];
//        a[j] = temp;
//    }
//
//    public static void main(String[] args) {
//        int arr[] = { 9, 2, 5, 6, 1, 3, 7, 4, 8 };
//        int size = arr.length;
//
//        SelectionSort o = new SelectionSort();
//        o.selectionSort(arr, size);
//
//        for (int i : arr)
//            System.out.print(i + " ");
//    }
//}
