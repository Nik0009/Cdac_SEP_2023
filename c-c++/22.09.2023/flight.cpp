// Define a class in C++ with following description:
// Private Members
// A data member Flight number of type integer
// A data member Destination of type string
// A data member Distance of type float
// A data member Fuel of type float
// A member function CALFUEL() to calculate the value of Fuel as per the following 
// criteria
//  Distance Fuel
//  <=1000 500
//  more than 1000 and <=2000 1100
//  more than 2000 2200
// Public Members
// A function FEEDINFO() to allow user to enter values for Flight Number, 
// Destination, Distance & call function CALFUEL() to calculate the quantity of Fuel
// A function SHOWINFO() to allow user to view the content of all the data members

#include <iostream>
using namespace std;

class flight
{
private:
int fno;
string fdes;
float fdis,fuel;

int CALFUEL()
{
    if (fdis<=1000)
    {
        fuel=500;
    }
    else if (fdis>1000 && fdis<=2000)
    {
        fuel=1100;
    }
    else if (fdis>2000)
    {
        fuel=2200;
    }
  return fuel;

}
public:
   void  FEEDINFO()
   {
     cout<<"Enter flight no: "<<endl;
            cin>>fno;
            cout<<"Enter destination: "<<endl;
            cin>>fdes;
            cout<<"Enter distance: "<<endl;
            cin>>fdis;
    CALFUEL();
     
   }

   void SHOWINFO()
   {
    cout<<"Flight Details:"<<endl;
    cout<<"Flight Number:"<<fno<<endl<<"Destination:"<<fdes<<endl<<"Distance:"<<fdis<<endl;
    cout<<"fuel:"<<CALFUEL();
   }
};

int main()
{
    flight f;
    f.FEEDINFO();
    f.SHOWINFO();
    return 0;
}