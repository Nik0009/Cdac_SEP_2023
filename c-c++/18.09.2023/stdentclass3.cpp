#include<iostream>
using namespace std;

class student 
{
    private:
    int prn_no;
    char names[20];
    public:
    void get();
    void put();

};
   void student::get() // "::" is a scope resolution operator
    {
        cout<<"\nenter prn no and name:";
        cin>>prn_no>>names;

    }
    void student::put()
    {
        cout<<"\nprn no is:"<<prn_no;
        cout<<"\nstudent name:"<<names;
    }


int main()
{
    student s[2];
    for (int i = 0; i < 2; i++)
    {
        s[i].get();
        s[i].put();
    }
    
    return 0;

}