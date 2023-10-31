#include<stdio.h>

void main()
{
    int a[2]={1,2};
    int n;
    printf("enter element :");
    scanf("%d",&n);
    for (int i = 0; i <3; i++)
    {
        if (n==a[i])
        {
            printf("%d",a[i]);
        }
        
    }
    
    
}