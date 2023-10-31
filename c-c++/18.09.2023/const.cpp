#include<iostream>
using namespace std;

class student
{
    private:
    int id;
    string name;
    string add;
    long conct;

    public:
    student() 
    {
       id=1;
       name="ab";
       add="st";
       conct=123;
    }
    student(int i,string n,string a,long c) 
    {
       id=i;
       name=n;
       add=a;
       conct=c;
    }
     void show()
    {
        cout<<"\nid of student is "<<id;
        cout<<"\nname of student is "<<name;
        cout<<"\naddress of student is "<<add;
        cout<<"\ncontact of student is "<<conct;

    }
};

int main()
{
   
    student s1,s(1,"ab","st",123); 
    //s1.show();
    s.show();
    return 0;
    
}