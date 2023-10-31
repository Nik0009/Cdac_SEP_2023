// 9. WAP to check whether no. is Armstrong no.

#include<stdio.h>
void isArmstrong(int x);
void main()
{
    int n;
    printf("enter any number to check whether no. is Armstrong no:");
    scanf("%d",&n);
    isArmstrong(n);
}

void isArmstrong(int x)
{
    int temp,sum=0;
    int n=x;
    while (n>0)
    {
        temp=n%10;
        sum=sum +temp*temp*temp;
        n=n/10;
    }
     if (x==sum)
     {
        printf("number is Armstrong no.");
     }
     else
     {
         printf("number is not Armstrong no.");
     }
   
}