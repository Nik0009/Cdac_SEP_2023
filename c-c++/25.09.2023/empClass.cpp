
#include<iostream>
using namespace std;

class employess
{
    private:
    int salary;
   

    public :
    int getdata()
    {
        cout<<"enter salary:"<<endl;
        cin>>salary;
        return 0;

    }
    void putdata()
    {
        cout<<"salary:"<<salary;
    }
};

class salary : public employess
{
    public: 
    void show()
    {
        getdata();
        putdata();
    }
};

int main()
{
    salary s;
    s.show();
    return 0;
}