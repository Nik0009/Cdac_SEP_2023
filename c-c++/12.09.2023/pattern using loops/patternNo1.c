    //         * 
    //       * * * 
    //     * * * * * 
    //   * * * * * * * 
    // * * * * * * * * *

#include<stdio.h>
void main()
{
    int r,c,s,k;
    for (r= 1; r <=5; r++)
    {
        for (s=r;s<=5; s++)
        {
           printf(" ");
        }
        for (c=r; c>=1; c--)
        { 
            printf("*");
        }
        for (k=2; k<=r; k++)
        {
            printf("*");
        }
        printf("\n");
    }
    
    // int n=5,row,col;
    // for (row=0;row<n;row++)
    // {
    //     for (int s=0;s<n-row-1;s++)
    //     {
    //         printf(" ");
    //     }
    //     for (col=0;col<row+1;col++)
    //     {
    //        printf("* ");
    //     }
    //     printf("\n");
    }
    
}