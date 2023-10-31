#include<stdio.h>
void main()
{
    int a[3][3]={1,2,3,4,5,6,7,8,9};
    int sum=0;

    //  for (int i = 0; i < 3; i++)
    // {
    //     for (int j = 0; j < 3; j++)
    //     {
           
    //         sum=a[0][0]+a[0][1]+a[0][2]+a[1][1]+a[2][0]+a[2][1]+a[2][2];

    //     }
        
    // }  


     for (int i = 0; i < 3; i++)
    {
        for (int j = 0; j < 3; j++)
        {
           
           if ((i+j)==0 || (i+j)==1 || (i+j)==2 && i!=0 && i!=2|| (i+j)==3 || (i+j)==4 )
           {
            sum=sum+a[i][j];
           }
           

        }
        
    }  

    printf("\nsum of matrix:-%d",sum);
   

}