// 11.Write a program to Calculate Product of Digits of a Number.

#include<stdio.h>
int main()
{
    int n,product=1,temp;
    printf("Enter any number for cube :");
    scanf("%d",&n);
    int num=n;
    while (num!=0)
    {
        temp=num%10;
        product=product*num;
        num=num/10;
    }
    printf("Product of Digits of a %d.",product);
    return 0;
}