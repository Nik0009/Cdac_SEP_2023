#include<stdio.h>

void main()
{
    int n;
    printf("enter any number to chcek number is even or odd:");
    scanf("%d",&n);
    if (n%2==0)
    {
        printf("%d is even.",n);

    }
    else
    {
        printf("%d is odd.",n);
    }
    
}