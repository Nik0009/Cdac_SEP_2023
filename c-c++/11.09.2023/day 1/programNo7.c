// 7.A number is entered through the keyboard.the number may contain 1,2,3,4 or 5 digits.Write a program to find a number of digits in the number.

#include<stdio.h>
void main()
{
    int n,temp,count=0;
    printf("Enter any number:");
    scanf("%d",&n);
    int q=n;
      while (q!=0) 
   {    
       temp=temp*10+q%10;
       q=q/10;
       count++;            
   }
   
   printf("count=%d",count);
}