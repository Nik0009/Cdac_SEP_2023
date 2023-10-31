// 4. Write a C program to check if it is a palindrome number or not using a recursive method.

#include<stdio.h>
void main()
{
    int n,temp=0,q,r;
    printf("enter any number to check if it is a palindrome number or not:");
    scanf("%d",&n);
    q=n;


    while (q!=0) 
   {        
       temp=temp*10+q%10;
       q=q/10;                 
   }

   if (temp==n)
   {
    printf("number is palindrome.");
   }
   else
   {
    printf("number is not palindrome.");
   }
   
}