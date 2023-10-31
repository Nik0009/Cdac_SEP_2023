// Binary opertor
#include <iostream>
using namespace std;

class demo
{
    int a, b;

public:
    void getdata()
    {
        cout << "Enter the values  of a andb\n ";
        cin >> a >> b;
    }
    void putdata(){
        cout << "values of  a = "<<a<<endl<<" values of b = "<<b<<endl;
    } 

    demo operator+(demo x)
    {
        demo m;
        m.a = a + x.a;
        m.b = b + x.b;
        return m;
    }
};
void main()
{
    demo d1, d2, d3;
    d1.getdata(); // a=2,b=3
    d2.getdata(); // a=4,b=5
    d3 = d1 + d2; // calling
    d3.putdata();
    
}