#include<iostream>
using namespace std;

// template <class T1,class T2>
// T1 smaller(T1 x,T2 y)
// {
//     return (x<y ? x : y);
// }
// int main()
// {
//     int a=87;
//     float b=23.3;
//     cout<<smaller(a,b)<<endl;
// }

template <class t1,class t2>
t1 areaofrect(t1 x,t2 y)
{
    return x*y;
    
}
int main()
{
    int l=2,b=3;
    cout<<areaofrect(l,b)<<endl;
}