#include <iostream>
using namespace std;
double division(int a, int b)
{
    if (b == 0)
    {
        throw "number is not divisible by zero.";
    }
    return a / b;
    
}

int main(){
    int a, b;
    double z=0;
        cout << "enter two numbers:";
        cin >> a >> b;
    try
    {
        z=division(a,b);
        cout<<z<<endl;
    }
    catch (const char* msg)
    {
        cerr<<msg<<endl;
    }
    return 0;
}