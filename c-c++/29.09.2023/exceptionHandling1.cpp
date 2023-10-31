#include <iostream>
using namespace std;

int main()
{
    // try
    // {
    //     int age;
    //     cout<<"\n enter the age of the candidate:";
    //     cin>>age;
    //     if (age>=18)
    //     {
    //         cout<<"Access greaned-";
    //     }
    // else
    // {
    //     throw 505;
    // }
   
    // }
    // catch(...){
    //     cout<<"access denied";
    // }


     try
    {
        int age;
        cout<<"\n enter the age of the candidate:";
        cin>>age;
        if (age>=18)
        {
            cout<<"Access greaned-you are old enough to vote.";
        }
    else
    {
        throw "access denied-you must be at least 18 years old.";
    }
   
    }
    catch(const char* m){
        // cerr<<m;
       cout<<"access denied-you must be at least 18 years old.";
    }
}