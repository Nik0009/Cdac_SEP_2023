#include <iostream>
using namespace std;

class cashRegister
{
    private:
    int cashOnHand,r=0;

    public:
    cashRegister()
    {
        r=500;
    }
    cashRegister(int a)
    {
        r=a;
    }
    int getCurrentBalance()
    {
        return cashOnHand;
    }

    void acceptAmount(int am)
    {
        r=am;
       
    }

};

class  dispenserType
{
    private: 
    int numberOfItems,cost;

    public:
    dispenserType ()
    {
        numberOfItems=50;
        cost=50;
    }
    dispenserType (int i,int c)
    {
        numberOfItems=i;
        cost=c;
    }

    int getNoOfItems() 
    {
        return numberOfItems;
    }

    int getCost()
    {
        return cost;
    }

    void makeSale()
    {
        numberOfItems-=1;
    }


};


int showSelection()
{
    return 0;
}

int  sellProduct(int dispenser,int register)
{
    
    return 0;
}

int main()
{ 
    return 0;
}