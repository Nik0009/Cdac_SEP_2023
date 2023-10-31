#include<iostream>
using namespace std;

class Distance
{
    private:
    int feet;
    int inches;

    public:
    Distance()
    {
        feet=0;
        inches=0;
    }

    Distance(int f,int i)
    {
        feet=f;
        inches=i;
    }

    void operator =(const Distance &d)
    {
        feet=d.feet;
        inches=d.inches;
    }

    void displaydistance()
    {
        cout<<"F:"<<feet<<endl<<"I:"<<inches<<endl;
    }


};

int main()
{
    Distance d1(11,10),d2(5,11);
    cout<<"First Distance:"<<endl;
    d1.displaydistance();
     cout<<"second Distance:"<<endl;
    d2.displaydistance();
    // using assignment operator
    d1=d2;                              //calling 
    cout<<"First Distance:"<<endl;
    d1.displaydistance();


}
