// 1.Calculate the Factorial of a Number

#include<stdio.h>
void main()
{
    int n,fact=1;
    printf("enter any number for factorial:");
    scanf("%d",&n);
    for (int i=1; i<=n; i++)
    {
        fact=fact*i;   
    }
   printf("fact=%d",fact);
}
