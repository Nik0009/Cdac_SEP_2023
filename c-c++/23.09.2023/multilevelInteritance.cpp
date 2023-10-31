// class number with data member n take input in a funt.
#include<iostream>
using namespace std;

class number
{
    protected:
    int n;
    public:
    int takeinput()
    {
       cout<<"enter num:";
       cin>>n;
       cout<<"num:"<<n<<endl;
       return n;
    }
};

class square : public number
{
    
    public:
     int sq()
    {
        int num=takeinput();
        int sqa=num*num;
        cout<<"square:"<<sqa<<endl;
        return sqa;

    }
};

class cube :public square
{
    public:
    int cbe()
    {
        int num=sq();
        cout<<"cube:"<<num*num<<endl;
        return num;
    }
};

int main()
{
    cube c;
    c.cbe();
    return 0;
}