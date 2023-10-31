#include<iostream>
using namespace std;

// template<class T>
// T add(T a,T b)
// {
//     return a+b;

// }

// int main()
// {
//     int x=24,y=12,z;
//     z=add(x,y);
//     cout<<"Addition:"<<z<<endl;

// }


template<class a>
a mul(a x,a y)
{
    return x*y;

}

int main()
{
    int x=2,y=1,z;
    z=mul(x,y);
    cout<<"Multiplication:"<<z<<endl;

}