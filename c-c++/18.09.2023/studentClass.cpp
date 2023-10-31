// creating class 
#include<iostream>
using namespace std;

class student 
{
    int prn_no;
    char names[20];
    public:
    void get()
    {
        cout<<"\nenter prn no and name:";
        cin>>prn_no>>names;

    }
    void put()
    {
        cout<<"\nprn no is:"<<prn_no;
        cout<<"\nstudent name:"<<names;
    }

};

int main()
{
    student s,*p;
    p=&s;
    p->get();
    p->put();
    return 0;

}
