#include<stdio.h>
void main()
{
    int pa,d;
    printf("Enter purchase amount:");
    scanf("%d",&pa);
    if (pa>1500)
    {
        d=pa-200;
        printf("total amount=%d",d);
    }
   else
   {
        printf("total amount=%d",pa);
   }
}