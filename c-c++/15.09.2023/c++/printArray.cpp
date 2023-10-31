// 1.WAP to print the element of the array
#include<iostream>
using namespace std;
int main()
{
    // int a[5]={1,2,3,4,5};
     int a[5];
    for (int i = 0; i <5; i++)
    {
        cout<<"enter elements:";
        cin>>a[i];
    }
    cout<<"................................................................................................................";
    for (int j = 0; j <5; j++)
    {
        cout<<endl<<"elements of array:"<<a[j];        
    }

    return 0;
}