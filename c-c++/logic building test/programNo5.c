#include<stdio.h>
void main()
{
    float a,b,c,d,e;
    printf("Enter five subject marks:\n");
    scanf("%f%f%f%f%f",&a,&b,&c,&d,&e);
    float total=a+b+c+d+e;
    float per=(total/500.0)*100;
    printf("your percentage is %.2f\n",per);

    if (per>80)
    {
        printf("Grade=A+");
    }
    else if (per>=65 && per<=80)
    {
        printf("Grade=A");
    }
    else if (per>=50 && per<=65)
    {
       printf("Grade=B");
    }
    else if (per>=42 && per<=50)
    {
        printf("Grade=C");
    }
    else
    {
        printf("FAIL.");
    }
    
}

// #include <stdio.h>
 
// int main()
// {
//     float eng, phy, chem, math, comp; 
//     float total, average, percentage;
 
//     printf("Enter marks of five subjects: :- ");
//     scanf("%f%f%f%f%f", &eng, &phy, &chem, &math, &comp);
 
//     total = eng + phy + chem + math + comp;
//     average = total / 5.0;
//     percentage = (total / 500.0) * 100;
 
//     printf("Total marks = %.2f\n", total);
//     printf("Average marks = %.2f\n", average);
//     printf("Percentage = %.2f", percentage);
 
    
// }