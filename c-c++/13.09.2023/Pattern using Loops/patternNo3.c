        //         A
        //       A B C
        //     A B C D E
        //   A B C D E F G
        // A B C D E F G H I

#include<stdio.h>
int main()
{
    int r,c,s,k,rows;
    for (r= 1; r <=5; r++)
    {
        for (s=r;s<=5; s++)
        {
           printf(" ");
        }
       
         for (c=1;c<2*r;c++ )
        {
            printf("%c",'A'-1+c); 
        }
        
        printf("\n");
    }
}