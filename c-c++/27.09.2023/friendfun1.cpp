#include <iostream>
using namespace std;

class A
{
    int a;

public:
    A()
    {
        a = 10;
    }
    friend void add();
};

class B
{
    int b;

public:
    B()
    {
        b = 20;
    }
    friend void add();
};

void add()
{
    A x;
    B y;
    int c = x.a +y.b;
    cout << "Addition:"<<c;
}
int main()
{
    add();
}