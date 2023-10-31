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
      if (ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
       {
         len++;
       }
       
    }
         printf("%d",len);
}