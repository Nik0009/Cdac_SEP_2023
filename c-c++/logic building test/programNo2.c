#include<stdio.h>
void main()
{
    // int n=1234,sum=0;
    // int a=n/1000;
    // int b=n/100%10;
    // int c=n/10%10;
    // int d=n%10;

    // sum=a+b+c+d;
    // printf("sum=%d",sum);

    int n,sum=0,temp;
    printf("enter any number:");
    scanf("%d",&n);
    while (n!=0)
    {
        temp=n%10;
        sum=sum+temp;
        n=n/10;
    }
    printf("sum=%d",sum);

}