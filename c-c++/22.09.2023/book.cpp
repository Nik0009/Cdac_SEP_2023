// Define a class BOOK with the following specifications :
// Private members of the class BOOK are
// BOOK NO integer type
// BOOKTITLE 20 characters
// PRICE float (price per copy)
// TOTAL_COST() A function to calculate the total cost for N number of copies
// where N is passed to the function as argument.
// Public members of the class BOOK are
// INPUT() function to read BOOK_NO. BOOKTITLE, PRICE
// PURCHASE() function to ask the user to input the number of copies to be
// purchased. It invokes TOTAL_COST() and prints the total cost to
// be paid by the user.
// Note : You are also required to give detailed function definitions.

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

class book
{
private:
    int book_no;
    char booktitle[20];
    float price;

    int TOTAL_COST(int n)
    {
        int t_c = n * price;
        cout << "total cost to be paid by you:" << t_c;
        return 0;
    }

public:
    void INPUT()
    {
        cout << "Enter values:" << endl;
        cout << "BOOK_NO:" << endl;
        cin >> book_no;
        cout << "BOOKTITLE:" << endl;
        cin >> booktitle;
        cout << "PRICE:";
        cin >> price;
       
    }

    void PURCHASE()
    {
        int noc;
        cout << "Enter number of copies to be purchased:" << endl;
        cin >> noc;
        TOTAL_COST(noc);
    }
};

int main()
{
    book b;
    b.INPUT();
    b.PURCHASE();
}