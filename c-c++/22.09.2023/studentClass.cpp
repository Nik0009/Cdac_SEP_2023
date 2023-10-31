// Define a class student with the following specification
// Private members of class student
// admno integer
// sname 20 character
// eng. math, science float
// total float
// ctotal() a function to calculate eng + math + science with float return
// type.
// Public member function of class student
// Takedata() Function to accept values for admno, sname, eng, science and
// invoke ctotal() to calculate total.
// Showdata() Function to display all the data members on the screen.

#include <iostream>
using namespace std;

class student
{
private:
    int admno;
    char sname[20];
    float eng, science, math, total;

    float ctotal()
    {
        total = eng + math + science;
        return total;
    }

public:
    void Takedata()
    {
        cout << "Student Details:" << endl;
        cout << "Enter admno: ";
        cin >> admno;
        cout << "Enter sname : ";
        cin >> sname;
        cout << "Enter english marks : ";
        cin >> eng;
        cout << "Enter maths marks : ";
        cin >> math;
        cout << "Enter science marks : ";
        cin >> science;
        ctotal();
    }
    int Showdata()
    {
        cout << endl
             << "student information:" << endl
             << "admo:" << admno << endl
             << "stdudent name:" << sname << endl
             << "student marks:" << endl
             << "eng=" << eng << endl
             << "maths=" << math << endl
             << "scicence:" << science << endl
             << "total=" << total << endl;
        return 0;
    }
};

int main()
{
    student s;
    s.Takedata();
    s.Showdata();
    return 0;
}