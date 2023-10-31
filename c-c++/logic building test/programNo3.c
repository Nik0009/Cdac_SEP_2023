#include<stdio.h>
void main()
{
    int cp,sp,p,l;
    printf("Enter cost price and selling price of item:");
    scanf("%d%d",&cp,&sp);

    if (sp>cp)
    {
        p=sp-cp;
        printf("You have profit of RS.%d.",p);
    }
    else
    {
        l=cp-sp;
        printf("You have loss of RS.%d.",l);
    }
    
}