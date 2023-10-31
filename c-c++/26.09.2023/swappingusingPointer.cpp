#include<iostream>
using namespace std;

void swap(int *,int *);
int main()
{
    int a,b;
    cout<<"Enter two values:";
    cin>>a>>b;
    swap(&a,&b);
    cout<<"vaules after swapping:"<<endl<<"a:"<<a<<endl<<"b:"<<b;
    return 0;
}

void swap(int *a,int *b )
{
    int *temp;
    *temp=*b;
    *b=*a;
    *a=*temp;
}