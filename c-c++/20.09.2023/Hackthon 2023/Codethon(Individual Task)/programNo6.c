// 6. Write a program to print EVEN numbers from 1 to N using a while loop.

#include<stdio.h>
int main()
{
    int n;
    printf("Enter any number:");
    scanf("%d",&n);

   
        int i=1;
        while (i<=n)
        {
             if (n%2==0)
             {
                printf("even number=%d\n",n);
             }
            i++;
        }
    
    
    return 0;
}
