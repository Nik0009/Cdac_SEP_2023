
        //         * 
        //       * * * 
        //     * * * * * 
        //   * * * * * * * 
        // * * * * * * * * * 
        //   * * * * * * * 
        //     * * * * * 
        //       * * * 
        //         *

// #include<stdio.h>
// void main()
// {
//     int r,c,s,k;
//     for (r= 1; r <=5; r++)
//     {
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
        // for (k=1; k<=r; k++)
        // {
        //     printf("*");
        // }
        // printf("\n");



//     }
// }


#include<stdio.h>
int main(){
    int n=6,row,col;

    for(int row=1;row<n;row++){
        for(int col=0;col<n-row-1;col++){
            printf(" ");
        }
        for(int col=0;col<2*row-1;col++){
            printf("*");
        }
        printf("\n");
    }
    for(int row=4;row>=0;row--){
        //space
        for(int col=1;col<=n-row-1;col++){
            printf(" ");
        }
        //star
        for(int col=1;col<=2*row-1;col++){
            printf("*");
        }
        printf("\n");
    }
}