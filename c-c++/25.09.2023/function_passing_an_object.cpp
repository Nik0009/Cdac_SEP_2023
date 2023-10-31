//Program on function passing an object
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
			void add(Test x2)    // function receiving an object
			{
				int x,y;
				x= a + x2.a;
				y= b + x2.b;
				cout<<"X = "<<x<<endl;
				cout<<"Y = "<<y<<endl;
			}
}; // end of class
int main()
{
		
		Test t1,t2;
		t1.set(10,20);
		t2.set(30,40);
		t1.add(t2);   // passing object to function
		t2.add(t1);   // passing object to function
}