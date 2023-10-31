// write a program to find factorial of no with return with arguments.

#include<iostream>
using namespace std;

int fact(int n);

int main()
{
    int n;
    cout <<"enter number for factorial:";
    cin >> n;
    fact(n);
    
}

int fact(int n)
{
    int f=1;
    for (int i = 1; i <=n; i++)
    {
        f=f*i;
    }
    cout<<f;
   return 0;
}