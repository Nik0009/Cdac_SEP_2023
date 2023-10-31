
#include<iostream>
using namespace std;
// class A
// {
//     private :
//     int a;
//     public:
//     int get()
//     {
//         cout<<"enter values of a:";
//         cin>>a;
//         return a;
//     }
   
// };

// class B
// {
//     private :
//     int b;
//     public:
//     int getin()
//     {
//         cout<<"enter values of b:";
//         cin>>b;
//         return b;
//     }
// };

// class C : public A,public B
// {
//     private :
//     int c;
//     public:
//    void add()
//     {
//         int x=get();
//         int y=getin();
//         c=x+y;
//         cout<<"C:"<<c;
//     }
// };

// int main()
// {
//     C c;
//     c.add();
// }


class A
{
    protected :
    int a;
    public:
    void get()
    {
        cout<<"enter values of a:";
        cin>>a;
    }
   
};

class B
{
   protected :
    int b;
    public:
    void getin()
    {
        cout<<"enter values of b:";
        cin>>b;
    }
};

class C : public A,public B
{
    private :
    int c;
    public:
   void add()
    {
        c=a+b;
        cout<<"C:"<<c;
    }
};

int main()
{
    C c;
    c.get();
    c.getin();
    c.add();
}