#include<stdio.h>
#include<string.h>

void main()
{
    char ch[20];
    int len=0;
    printf("enter any string:");
    scanf("%s",&ch);
    for (int i = 0;ch[i]!='\0'; i++)
    {
        len++;
    }
    int l=len;

    for (int i=0; i<l; i++)
    {
       if (i==0 || i==(l-1))
       {
         printf("%c",ch[i]);
       }
       
    }
    
    
}