    //          * 
    //        * * * 
    //      * * * * * 
    //    * * * * * * * 
    //  * * * * * * * * *
    //    * * * * * * *
    //      * * * * *
    //        * * *
    //          *

#include<stdio.h>
void main()
{
    int r,c,s,k;
    for (r= 1; r <=5; r++)
    {
        // for (s=r;s<=5; s++)
        // {
        //    printf(" ");
        // }
        // for (c=r; c>=1; c--)
        // { 
        //     printf("*");
        // }
        // for (k=2; k<=r; k++)
        // {
        //     printf("*");
        // }
        // second half
        // for (s=r;s<=5; s++)
        // {
        //    printf(" ");
        // }
        // for (c=r; c>=1; c--)
        // { 
        //     printf("*");
        // }
        for (k=1; k<=r; k++)
        {
            printf("*");
        }
        printf("\n");
    }
}
