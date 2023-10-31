#include<iostream>
using namespace std;

int add (int a,int b );
int add (int a,int b,int c );
int add (int a,float b );

int main()
{
    int a,b,c=0;
    cout <<"enter  number:"<<endl;
    cin >>a>>b>>c ;
    add(a,b);
    add(a,b,c);
    add(a,b);
    
}

int add(int a,int b)
{
    int sum=a+b;
    cout<<"sum="<<sum<<endl;
    return 0;
}
int add(int a,int b,int c)
{
    int sum=a+b+c;
    cout<<"sum="<<sum<<endl;
     return 0;
}
int add(int a,float b)
{
    float sum=a+b;
    cout<<"sum="<<sum;
     return 0;
}