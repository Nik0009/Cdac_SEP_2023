// wap area of circle and rectangle.

#include <iostream>
using namespace std;

int AoCR(int);
int AoCR(int, int);


int main()
{
    int r,l,b;
    cout << "enter radius of circle:"<<endl;
    cin >> r;
    AoCR(r);
    cout << endl<<"enter length and breadth of reactanle:"<<endl;
    cin >> l>>b;
    AoCR(l,b);

}

int AoCR(int r)
{
    float pi = 3.14;
    int area;
    area = pi * r * r;
    cout<<"area of circle="<<area;
    return 0;
}
int AoCR(int l, int b)
{
    int area;
    area = l * b;
    cout<<"area of rectangle="<<area;
    return 0;
}
