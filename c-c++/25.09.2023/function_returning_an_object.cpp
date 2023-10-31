//Program on function returning an object

#include<iostream>
using namespace std;

class Test
{
		int a,b;
		public:
			void set(int x, int y)
			{
				a=x;
				b=y;
			}
			Test add(Test x2) // function receiving an object, returning an object
			{
				Test t3;
				t3.a = a + x2.a;
				t3.b = b + x2.b;
				return t3;
			}
		void disp()
		{
			cout<<"A = "<<a<<endl;
			cout<<"B = "<<b<<endl;
		}
};//end of class
int main()
{
		
		Test t1,t2,t4;
		t1.set(10,20);
		t1.disp();
		t2.set(30,40);
		t2.disp();
		t4=t1.add(t2); //passing an object, receiving an object
		t4.disp();
	
}