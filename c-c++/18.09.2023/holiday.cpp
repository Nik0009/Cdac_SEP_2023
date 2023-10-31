#include<iostream>
using namespace std;

class holiday
{
    private:
    int id;
    string name;
    string add;

    public:
    holiday()
    {
        id=1;
        name="ab";
        add="xyz";
    }
    holiday(string add)
    {
        add=add;
    }
    holiday(int a,string b)
    {
        id=a;
        name=b;
    }
    void show()
    {
        cout<<"\nid of customer is "<<id;
        cout<<"\nname of customer is "<<name<<endl;
       
    }
    void show2()
    {
        cout<<"\nid of customer is "<<id;
        cout<<"\nname of customer is "<<name;
        cout<<"\naddress of customer is "<<add;
    }


};

int main()
{
    holiday c,c1,c2(2,"xtr");
   // c.show();
    c1.show2();
    
    c2.show();

    return 0;
    
}