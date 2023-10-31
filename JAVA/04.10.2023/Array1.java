import java.util.Scanner;
class Array1{
  int a[][]=new int[3][3];
  int b[][]=new int[3][3];
  int result[][]=new int[3][3];
  int sum=0;
  void takeInput(){
  a[0]=new int[3];
  a[1]=new int[3];
  a[2]=new int[3];
  b[0]=new int[3];
  b[1]=new int[3];
  b[2]=new int[3];
  
  Scanner sc = new Scanner(System.in);
  System.out.println("\nEnter the valus of 1st matrix:");
  System.out.println("Enter"+(a[0].length+a[1].length+a[2].length+"num"));
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++){
			    a[i][j]=sc.nextInt();
			}
		}
	System.out.println("\nEnter the valus of 2nd matrix:");
  System.out.println("Enter"+(b[0].length+b[1].length+b[2].length+"num"));
		for(int i=0;i<b.length;i++){
			for(int j=0;j<b[i].length;j++){
			    b[i][j]=sc.nextInt();
			}
		}
      showOutput();	
      mult();	  
  }
  
  
  void showOutput(){
		System.out.println("\n\nOutput of 1st array is..");
		for(int i=0;i<a.length;i++){
		    for(int j=0;j<a[i].length;j++){
		       System.out.print(a[i][j] + "\t");
		}
		System.out.println();
		}
		
		
			System.out.println("\n\nOutput of 2nd array is..");
		for(int i=0;i<b.length;i++){
		    for(int j=0;j<b[i].length;j++){
		       System.out.print(b[i][j] + "\t");
		}
		System.out.println();
		}
	}
	
	
	
	void mult(){
		  for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                for (int k = 0; k < 3; k++) {
		  sum += a[i][k] * b[k][j];
		 }
		 result[i][j]=sum;
		 sum=0;
	  }
		  }
		  displayResult();
	}
	
	void displayResult(){
		System.out.println("Multiplication is" );
		  for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                System.out.print(result[i][j]+"\t");
	  }
	  System.out.println();
		  }
	}
	public static void main(String arg[]){
	    Array1 arr=new Array1();
		arr.takeInput();
	}
}