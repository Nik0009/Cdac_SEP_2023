// 8. WAP to print prime no.
#include<stdio.h>

int primeOrNot(int a);
void main()
{
    int n;
    printf("enter any number to check number is prime or not :");
    scanf("%d",&n);
    primeOrNot(n);

}
int primeOrNot(int a)
{
   int c=0;
   //int n=a;
    for (int i = 2; i <=a; i++)
    {
        if (a%i==0)
        {
            c++;
        }
        
    }
   if (c==1)
   {
     printf("prime no");
   }
   else
   {
    printf("not prime.");
   }
   
}