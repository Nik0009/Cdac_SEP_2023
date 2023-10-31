#include<iostream>
using namespace std;

class addition
{
    private :
    int a,b;

    public:

    void add()
    {
        cout<<"Enter two numbers:";
        cin>>a>>b;
        int s=a+b;
        cout<<"sum="<<s<<endl;

    }

    int add(int a,int b)
    {
        int sum=a+b;
        cout<<"sum="<<sum;
        return 0;
    }
     
};

int main()
{
    addition a;
    a.add();
    a.add(1,2);
}