
import java.util.Scanner;

class JaggedArrayDemo1{
	
	
	
public static void main(String a[ ]){

	int arr[][]={{1,2,3,4,5},{1,2,3},{4,6,7,8}};
	for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+"\t");	
			}
			System.out.println();
		}
}
}