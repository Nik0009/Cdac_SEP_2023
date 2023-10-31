#include <iostream>
using namespace std;

class deci
{
    int decimal;

public:
    deci()
    {
        decimal = 10;
    }
    friend void decNotoBinNo();
};

// class bin
// {
//     int binary = 0;

// public:
//     friend void decNotoBinNo();
// };

// void decNotoBinNo()
// {
//     int remainder, product = 1;
//     deci d;
//     bin b;
//     while (d.decimal != 0)
//     {
//         remainder = d.decimal % 2;
//         b.binary = b.binary + (remainder * product);
//         d.decimal = d.decimal / 2;
//         product *= 10;
//     }
//     cout << "The number in the binary form is: " << b.binary;
// }

void decNotoBinNo()
{
    deci d;
    int n = d.decimal;
    int b[10], index;

    for (index = 0; n > 0; index++)
    {

        b[index] = n % 2;
        n = n / 2;
    }
    cout << "Binary is ";
    for (index = index - 1; index >= 0; index--)
    {
        cout << b[index];
    }

    //  for (index = 0; n > 0; index++)
    // {

    //     b[index] = n % 8;
    //     n = n / 8;
    // }
    // cout << "Binary is ";
    // for (index = index - 1; index >= 0; index--)
    // {
    //     cout << b[index];
    // }
}

int main()
{

    decNotoBinNo();
}