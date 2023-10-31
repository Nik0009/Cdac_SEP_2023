// 3. Implement a Simple Calculator

#include<stdio.h>
void main()
{
    int n,a,b,sum=0,sub=0,mul=0,div=0,mod=0;
    printf("1.Addition\t 2.Subtraction\t 3.Multipilication\t 4.Division\t 5.Mode\nEnter any number from above option:\n");
    scanf("%d",&n);

    switch(n)
    {
    case 1:
        printf("Enter two numbers:\n");
        scanf("%d%d",&a,&b);
        sum=a+b;
        printf("sum=%d",sum);
        break;

    case 2:
        printf("Enter two numbers:\n");
        scanf("%d%d",&a,&b);
        sub=a-b;
        printf("sub=%d",sub);
        break;
    
    case 3:
        printf("Enter two numbers:\n");
        scanf("%d%d",&a,&b);
        mul=a*b;
        printf("mul=%d",mul);
        break;

    case 4:
        printf("Enter two numbers:\n");
        scanf("%d%d",&a,&b);
        div=a/b;
        printf("div=%d",div);
        break;

    case 5:
        printf("Enter two numbers:\n");
        scanf("%d%d",&a,&b);
        mod=a%b;
        printf("mod=%d",mod);
        break;

    default:
        printf("please select correct option.");
        break;
    }
}
