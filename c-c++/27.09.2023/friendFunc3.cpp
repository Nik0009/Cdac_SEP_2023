#include <iostream>
using namespace std;

class L
{
    int l;

public:
   L()
    {
        l = 10;
    }
    friend void area();
};

class B
{
    int b;

public:
    B()
    {
        b = 20;
    }
    friend void area();
};

void area()
{
    L x;
    B y;
    int a = x.l *y.b;
    cout << "Addition:"<<a;
}
int main()
{
    area();
}