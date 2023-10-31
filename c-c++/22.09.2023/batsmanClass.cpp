// Define a class batsman with the following specifications:
// Private members:
// bcode 4 digits code number
// bname 20 characters
// innings, notout, runs integer type
// batavg it is calculated according to the formula –
//  batavg =runs/(innings-notout)
// calcavg() Function to compute batavg
// Public members:
// readdata() Function to accept value from bcode, name, innings, notout
// and invoke the function calcavg()
// displaydata() Function to display the data members on the screen.

#include <iostream>
using namespace std;

class batsman
{
private:
    int bcode, innings, notout, runs;
    float batavg;
    char bname[20];

private:
    float calavg()
    {
        batavg = runs / (innings - notout);
        return batavg;
    }

public:
    void readdata()
    {
         while(true){
            cout<<"Enter bcode: ";
            cin>>bcode;
            if(bcode>999 && bcode<10000){
                break;
            }
            }

        cout << "enter value of name, innings,runs, notout:" << endl;
        cin >> bname >> innings >> runs >> notout;
        calavg();
    }

    void displaydata()
    {
        cout << "batsman information:" << endl
             << "code:" << bcode << endl
             << "name:" << bname << endl
             << "innings:" << innings << endl
             << "runs:" << runs << endl
             << "notout:" << notout << endl
             << "batsman avg:" << calavg();
        
    }
};

int main()
{
    batsman b;
    b.readdata();
    b.displaydata();
    return 0;
}