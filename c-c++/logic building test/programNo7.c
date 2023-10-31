#include <stdio.h>
 
void main()
{
  
    int y;
    printf("Enter any year to check it is leap year or not:");
    scanf("%d",&y);

    if ((y%4==0 ) && (y%400==0) || (y%100!=0))
    {
        printf("leap year");
    }
    else
    {
    printf("leap not year");
    }
    
    // if (y%4==0)
    // {
    //    printf("leap year");
    // }
    // else
    // {
    //     printf("not leap year" );
    // }
    

}