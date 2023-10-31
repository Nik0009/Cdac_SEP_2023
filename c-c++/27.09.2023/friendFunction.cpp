#include<iostream>
using namespace std;

class demo
{
    friend void msg();
};

void msg()
{
    cout<<"\n i am friend function";
}
int main()
{
    msg();
}