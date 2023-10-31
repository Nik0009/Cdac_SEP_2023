                    //     1
                    //    123
                    //   12345
                    //  1234567
                    // 123456789


#include<stdio.h>
void main()
{
     int r,c,s,k,rows;
     printf("Enter rows:");
     scanf("%d",&rows);
    for (r= 1; r <=rows; r++)
    {
        for (s=r;s<=5; s++)
        {
           printf(" ");
        }
        // for (k=1; k<=r; k++)
        // {
        //     printf("%d",k);
        // }
         for (c=1;c<2*r;c++ )
        {
            printf("%d",c); 
        }
        // for (s=5;s>=r; s--)
        // {
        //    printf("* ");
        // }
        printf("\n");
    }

    // printf("Enter rows:");
    // scanf("%d",&rows);
    // for ( r=0;r<rows;r++)
    // {
    //     for ( s=0;s<2*(rows-r)-1;s++)
    //     {
    //         printf(" ");
    //     }
    //     for (c=1;c<2*r+2;c++ )
    //     {
    //         printf("%d",c);
    //     }
    //     printf("\n");
    // }
    
    
    
}