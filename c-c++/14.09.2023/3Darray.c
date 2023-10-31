#include<stdio.h>
void main()
{
    int a[2][2][2]={{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
    int b[2][2][2]={{{1,2},{3,4}},{{5,6},{7,8}},{{9,10},{11,12}}};
    int c[2][2][2];

     printf("\nsum of matrix:-\n");
     for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0;k<2; k++)
            {
                c[i][j][k]=a[i][j][k]+b[i][j][k];
            }
            
        }
          
    }

    for (int i = 0; i < 2; i++)
    {
        for (int j = 0; j < 2; j++)
        {
            for (int k = 0;k<2; k++)
            {
                printf("%d",c[i][j][k]);
            }
            
        }
          
    }





}