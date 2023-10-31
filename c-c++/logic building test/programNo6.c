#include <stdio.h>
 
void main()
{
    int m;
    printf("Enter any number from 1 to 12 for display month name: ");
    scanf("%d",&m);

    switch (m)
    {
    case 1:
    printf("jan");
    break;

    case 2:
    printf("fab");
    break;

    case 3:
    printf("mar");
    break;
    
    case 4:
    printf("april");
    break;

    case 5:
    printf("may");
    break;

    case 6:
    printf("jun");
    break;

    case 7:
    printf("july");
    break;

    case 8:
    printf("aug");
    break;

    case 9:
    printf("sep");
    break;

    case 10:
    printf("oct");
    break;

    case 11:
    printf("nov");
    break;

    case 12:
    printf("dec");
    break;
    
    default:
    printf("please enter values from 1-12");
    break;
    }
    
}