// 6. Write a C program to remove duplicates in a given array?
#include<stdio.h>
void main()
{
    int a[50],size;
    printf("enter no of elements in array:");
    scanf("%d",&size);
    for (int i = 0; i < size; i++)
    {
        scanf("%d",&a[i]);
    }
    
    for (int i = 0; i <size; i++)
    {
        for (int j = i+1; j <size ; j++)
        {
           if(a[i]==a[j])
           {
            for (int k = j;k<size-1; k++)
            {
                a[k]=a[k+1];
            }
            size--;
            j--;
           }
        }
      
    }
      for (int i = 0; i <size; i++)
        {
            printf("a=%d\n",a[i]);
        }
    
}