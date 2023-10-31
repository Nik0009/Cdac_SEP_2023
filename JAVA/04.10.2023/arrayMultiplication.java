import java.util.Scanner;

class arrayMultiplication{
	int row,coloum,srow,scoloum,sum=0;
	
	
	void mulOfTwoArray(){
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First array:");
		System.out.println("enter size of row in First array:");
		 row=sc.nextInt();
		System.out.println("enter size of coloum in First array:");
		 coloum=sc.nextInt();
		int a[][]=new int [row][coloum];

		System.out.println("enter First array elements: ");
		for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				a[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("output:-");
		System.out.println("First Array:-");
			for(int i=0;i<row;i++){
			for(int j=0;j<coloum;j++){
				System.out.print(a[i][j]+"\t");
		}
			System.out.println();
		}
		
		System.out.println("Second array:");
		System.out.println("enter size of row in Second array:");
		 srow=sc.nextInt();
		System.out.println("enter size of coloum in Second array:");
		 scoloum=sc.nextInt();
		 int b[][]=new int [srow][scoloum];

		System.out.println("enter Second array elements: ");
		for(int i=0;i<srow;i++){
			for(int j=0;j<scoloum;j++){
				b[i][j]=sc.nextInt();
			}
		}
		
		System.out.println("Second Array:-");
			for(int i=0;i<srow;i++){
			for(int j=0;j<scoloum;j++){
				System.out.print(b[i][j]+"\t");
		}
			System.out.println();
		}
		
		System.out.println("Multiplication of Two Arrays: ");
		
		int c[][]=new int[coloum][srow];
		//int s=coloum+srow;
		//System.out.println(s);
		
		for(int i=0;i<coloum;i++){
			for(int j=0;j<srow;j++){
				for(int k=0;k<coloum;k++)
				{
				sum+=a[i][k]*b[i][k];
				//System.out.print(b[i][j]+"\t");
				}
				c[i][j]=sum;
				sum=0;
		}
		
			//System.out.println();
		}
		
		
		System.out.println("Multiplication:-");
			for(int i=0;i<coloum;i++){
			for(int j=0;j<srow;j++){
				System.out.print(c[i][j]+"\t");
		}
			System.out.println();
		}
		
	}
	
	
	
	
public static void main(String a[ ]){
	arrayMultiplication obj=new arrayMultiplication();
	obj.mulOfTwoArray();
	
	
}
}