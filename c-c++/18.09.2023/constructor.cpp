#include<iostream>
using namespace std;
class demo
{
    private:
    int a,b;
    public:
    demo() // default constructor
    {
        a=10;
        b=20;
    }
    demo(int x,int y) // parameterized constructor
    {
        a=x;
        b=y;
    }
     demo(demo &d) // copy constructor- demo is name of class and &d is referance(address ) and d is object
    {
        a=d.a;
        b=d.b;
    }
    void show()
    {
        cout<<"\n value of a "<<a;
        cout<<"\n value of a "<<b;
    }
    ~demo() // destructor
    {
        cout<<"\n destructor called...";
    }
};

int main()
{
    demo d1,d2(1,2),d3(d1);
    d1.show();
    d2.show();
    d3.show();
    return 0;
    
}