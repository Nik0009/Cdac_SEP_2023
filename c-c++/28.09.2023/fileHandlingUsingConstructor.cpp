#include<iostream>
#include<fstream>
using namespace std;

int main()
{

ofstream obj("demo.txt");
obj<<"Hello"<<endl<<23<<endl;
cout<<"file is created";

}
