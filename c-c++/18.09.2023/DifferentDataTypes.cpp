// wap to differnt data type using function name is print.
#include<iostream>
using namespace std;

int print(int);
float print(float);
double print(double);
char print(char);

int main()
{
    int a;
    cout<<"enter number:"<<print(1);
    float n;
    cout<<endl<<"enter number:"<<print(1.2f);
    double c;
    cout<<endl<<"enter character:"<<print(1.22);
    char ch;
    cout<<endl<<"enter character:"<<print('h');
}
int print(int a)
{
    //cout<<a;
    return a;
}
float print(float n)
{
   // cout<<n;
    return n;
}
double print(double c)
{
   // cout<<ch;
    return c;
}
char print(char ch)
{
    return ch;
}