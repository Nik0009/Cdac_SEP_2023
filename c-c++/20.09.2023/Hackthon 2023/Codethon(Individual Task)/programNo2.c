// 2. .Write a function in C that reverses a given string in-place without using string function.

#include<stdio.h>
int main()
{
    char a[5]="abcd";
    for (int i =4; i>=0; i--)
    {
        printf("%c",a[i]); 
    } 
    return 0;
}
// output :- dcba