#include<iostream>
using namespace std;

class student
{
    private:
    char name[20];
    int id;

    public:
    void get();
    void put();


    class address
    {
        private:
        char city[20],state[20];
        public:
        void in();
        void out();

    };
};

void student::get()
{
    cout<<endl<<"name:";
    cin>>name;
    cout<<"id:";
    cin>>id;
}

void student::put()
{
    cout<<"name:"<<name<<endl<<"id:"<<id;
}

void student::address::in()
{
    cout<<"city:";
    cin>>city;
    cout<<"state:";
    cin>>state;
}

void student::address::out()
{
    cout<<"city:"<<city<<endl<<"state"<<state;
}

int main()
{
    student s;
    student :: address a;
    s.get();
    s.put();
    a.in();
    a.out();
}