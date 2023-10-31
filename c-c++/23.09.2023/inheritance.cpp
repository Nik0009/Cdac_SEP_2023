#include<iostream>
using namespace std;
class base
{
    private :
    int a,b;
    public:
    void get()
    {
        cout<<"enter two numbers:";
        cin>>a>>b;
    }

    void show()
    {
        cout<<"A:"<<a<<endl<<"B:"<<b<<endl;
    }
};

class derive : private base
{
    private:
    int c=10;

    public:
    void display()
    {
        get();
        show();
        cout<<"calling base class."<<endl;
        cout<<"C:"<<c;
    }
};


int main()
{
    derive d;
    // d.get();
    // d.show();
    d.display();
}