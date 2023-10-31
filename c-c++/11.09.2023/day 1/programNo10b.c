// 10 (b)The Policy followed by a company to process 
// customer orders
// Is given by the following rules:
// ( a )If a customer order is less than or equal to that in stock 
// and has credit is OK,supply has requirement.
// ( b ) If has credit is not OK do not supply.Send him 
// intimation.
// ( c ) If has credit is OK but the item in stock is less than has 
// order ,supply what is in stock.Intimate to him data the 
// balance will be shipped.

#include<stdio.h>
#include<conio.h>
void main()
{
    int order,stock=10000;
    char credit;
    printf("enter order:");
    scanf("%d",&order);
    printf("Is his credit is ok? (Press y/n):\n");
    credit=getch();

    if (order<=stock && credit=='y' || credit=='Y')
    {

        printf("we supply your requirement.");
    }
    else if (credit=='n' || credit=='N')
    {
        printf("your credit is not OK.so we do not supply requirement.");
    }
    else if (credit=='y' || credit=='Y' && order<stock)
    {
         printf("your credit is Ok but our stock is less than your requirment.");
    }

}
