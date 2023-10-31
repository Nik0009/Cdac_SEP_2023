// Define a class REPORT with the following specification:
// Private members :
// adno 4 digit admission number
// name 20 characters
// marks an array of 5 floating point values
// average average marks obtained
// GETAVG() a function to compute the average obtained in five subject
// Public members:
// READINFO() function to accept values for adno, name, marks. Invoke the
// function GETAVG()
// DISPLAYINFO() function to display all data members of report on the screen.
// You should give function definitions.

#include <iostream>
using namespace std;

class report
{
private:
   int adno;
   char name[20];
   float marks[5], avg;
    int sum = 0;

   int GETAVG()
   {
        for (int i = 0; i < 5; i++)
      {
         sum = sum + marks[i];
      }
      avg = sum / 5;
      return avg;
   }

public:
   void READINFO()
   {
      while (true)
      {
         cout << "Enter adno: ";
         cin >> adno;
         if (adno > 999 && adno < 10000)
         {
            break;
         }
      }
      cout << "name:" << endl;
      cin >> name;

      for (int i = 0; i < 5; i++)
      {
         cout << "student marks:" << endl;
         cin >> marks[i];
      }
      GETAVG();
   }

   void DISPLAYINFO()
   
   {
      cout << "Report Details:" << endl;
      cout << "adno:" << adno << endl
           << "name:" << name << endl
           << "marks:" << endl;
      for (int i = 0; i < 5; i++)
      {
         cout << marks[i] << endl;
      }
      cout << "avg:" <<GETAVG();
   }
};

int main()
{
   report r;
   r.READINFO();
   r.DISPLAYINFO();
}