#include<iostream>
using namespace std;

// template <class n1,class n2>
// n1 swap(n1 a,n2 b)
// {
//     int temp=b;
//     a=b;
//     b=temp;
    
//     return ;
// }

template <class T>
void swap(T *a,T *b)
{
    *a=*a+*b;
    *b=*a-*b;
    *a=*a-*b;
    
    return ;
}

int main()
{
    int l=2,b=3;
    swap(l,b);
    cout<<"a:"<<l<<endl<<"b:"<<b;
    
}