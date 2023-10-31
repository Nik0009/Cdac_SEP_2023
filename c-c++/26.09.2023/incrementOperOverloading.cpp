// wap to perform increment and decrement operator overloading


#include <iostream>
using namespace std;

class Check
{
    private:
       int i;
    public:

       Check(): i(3) 
       { }

       void operator ++() 
          { ++i; }
        

    Check operator -- ()
    {
        Check temp;
        temp.i = --i;
        return temp;
    }


    void Display() 
        { cout << "i=" << i << endl; }




};

int main()
{
    Check obj,obj1;    
    obj.Display();
    ++obj; 

    obj.Display();

   
    obj1 = --obj;
    obj.Display();
    obj1.Display();

    return 0;
}

