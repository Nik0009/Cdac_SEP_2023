class Demo1{

int a=10; // instance varible
static int b=20; // static varible
void show(){
	int c=a+b; // local varible
	int d; //declartion
	d=10; // initailization
	int e=50;
	System.out.println(c);
	System.out.println(d);
	System.out.println(e);
}
public static void main(String a[ ]){

Demo1 d1=new Demo1();
Demo1 d2=new Demo1();
Demo1 d3=new Demo1();

d1.show();
d2.show();
d3.show();


}
}