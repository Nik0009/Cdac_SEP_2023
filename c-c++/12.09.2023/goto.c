#include <stdio.h>
void main()
{
    int n, i = 1;
    printf("enter number:");
    scanf("%d", &n);
table:
    printf("%d*%d=%d\n", n, i, n * i);
    i++;
    if (i <= 10)
    {
        goto table;
    }
}