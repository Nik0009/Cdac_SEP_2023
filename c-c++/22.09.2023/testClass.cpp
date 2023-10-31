// Define a class TEST in C++ with following description:
// Private Members
// TestCode of type integer
// Description of type string
// NoCandidate of type integer
// CenterReqd (number of centers required) of type integer
// A member function CALCNTR() to calculate and return the number of centers as
// (NoCandidates/100+1)

// Public Members:
// - A function SCHEDULE() to allow user to enter values for TestCode, Description,
// NoCandidate & call function CALCNTR() to calculate the number of Centres
// - A function DISPTEST() to allow user to view the content of all the data members

#include <iostream>
using namespace std;

class TEST
{
private:
    int TestCode, NoCandidate, CenterReqd;
    string Description;

    int CALCNTR()
    {
        int calcntr = (NoCandidate / 100 + 1);
        return calcntr;
    }

public:
    void SCHEDULE()
    {
        cout<<"Center details:"<<endl;
        cout << "TestCode:"<<endl;
        cin>>TestCode ;
        cout<<"Description:"<<endl;
        cin>> Description ;
        cout<<"NoCandidate:"<< endl;
        cin >> NoCandidate;
        CALCNTR();
    }

    void DISPTEST()
    {
        cout << "centers information:" << endl;
        cout << "TestCode:" << TestCode << endl;
        cout<< "Description:" << Description << endl;
        cout<< "NoCandidate:" << NoCandidate << endl;
    }
};

int main()
{
    TEST t;
    t.SCHEDULE();
    t.DISPTEST();
    return 0;
}