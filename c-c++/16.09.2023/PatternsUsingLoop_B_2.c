        //         1 
        //       1 2 3 
        //     1 2 3 4 5 
        //   1 2 3 4 5 6 7 
        // 1 2 3 4 5 6 7 8 9 
        //   1 2 3 4 5 6 7 
        //     1 2 3 4 5 
        //       1 2 3 
        //         1 

#include<stdio.h>
int main(){
    int n=6,row,col;

    for(int row=1;row<n;row++){
        for(int col=0;col<n-row-1;col++){
            printf(" ");
        }
        for(int col=1;col<2*row;col++){
            printf("%d",col);
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
            printf("%d",col);
        }
        printf("\n");
    }
}