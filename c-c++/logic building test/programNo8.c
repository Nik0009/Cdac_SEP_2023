#include<stdio.h>
void main()
{
    int a=1,b=2;
    a=a+b;
    b=a-b;
    a=a-b;

    printf("a=%d,b=%d",a,b);
}