#include<iostream>
using namespace std;

class rectangle
{
private:
   int l,b;
public:
    rectangle()
    {
        l=1;
        b=2;
    }
    rectangle(int a,int x)
    {
        l=a;
        b=x;
    }
     rectangle(rectangle &r)
    {
        l=r.l;
        b=r.b;
    }

    void area()
    {
        int area=l*b;
        cout<<"\n area: "<<area;
    }
};


int main()
{
    rectangle r,r1(1,2),r2(r);
    r.area();
    r1.area();
    r2.area();

    return 0;
}