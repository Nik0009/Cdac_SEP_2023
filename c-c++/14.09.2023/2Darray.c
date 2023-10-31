#include<stdio.h>
void main()
{
    int a[3][3]={1,2,3,4,5,6};
    int b[3][3]={1,2,3,4,5,6};
    int c[3][3];
    //printf("\nEnter elemenst of matrix:");
    // for (int i = 0; i < 2; i++)
    // {
    //     for (int j = 0; j < 2; j++)
    //     {
    //         scanf("%d",&a[i][j]);

    //     }
    // }
   // printf("\nmatrix:-\n");
   // printf("[");
     for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            // printf("%d",a[i][j]);
            // printf("\t");
           c[i][j]=a[i][j]+b[i][j];

        }
        // printf("\n");  
    }
    //printf("]");   

    printf("\nsum of matrix:-\n");
     for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
            printf("%d",c[i][j]);
            printf("\t");

        }
         printf("\n");  
    }

}