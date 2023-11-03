
package searching;

public class BinarySearch {
    public int binarySearch(int a[],int start,int end,int key){
        
        while(start<=end){
           int  mid=(start+end)/2;
            
            if(a[mid]==key){
                return 1;
            }
            if(a[mid]<key){
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        
        int arr[]={1,3,4,5,7,8};
        int start,end;
        start=arr[0];
        end=arr.length-1;
        BinarySearch o=new BinarySearch();
        if(o.binarySearch(arr, start, end, 332)==1){
            System.out.println("key found");
        }  
        else{
            System.out.println("key not found");
        }
    }
}
