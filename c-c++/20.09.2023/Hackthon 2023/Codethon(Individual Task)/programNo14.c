// 14.Write a C program that demonstrates matrix multiplication for two 3x3 matrices,
// matrix1 and matrix2, resulting in a resultMatrix. The program checks if matrix
// multiplication is possible and performs the operation if conditions are met.

#include<stdio.h>
int main()
{
    int matrix1[3][3]={1,2,3,4,5,6},matrix2[3][3]={1,2,3,4,5,6},resultMatrix[3][3],mul=1;
    for (int i = 0; i <3; i++)
    {
        for (int j = 0; j <3; j++)
        {
            resultMatrix[i][j]= matrix1[i][j]*matrix2[i][j];
        }
        
    }

    for (int i = 0; i <3; i++)
    {
        for (int j = 0; j <3; j++)
        {
          //mul=mul+resultMatrix[i][j];
          //printf("mul=%d", resultMatrix[i][j]);
        }
        
    }
  printf("sum of two matrices of order 2*2 using multidimensional arrays =%d",mul);
    return 0;
}