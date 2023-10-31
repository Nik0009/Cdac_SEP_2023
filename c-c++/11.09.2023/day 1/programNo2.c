// 2. Find the Prime Numbers in a Range

// #include<stdio.h>
// int main()
// {
//     int s,e,c;
//     printf("enter staring range number and ending range number:");
//     scanf("%d%d",&s,&e);

//       for (int i =s; i<=e; i++)
//       {
//         c=0;
//         for (int j = 1; j<=i; j++)
//         {
//           if (i%j==0)
//           {
//             c++;
            
//           }
//           if (c==2)
//           {
//             printf("%d\n",i);
//           }
          
//         }
        
        
//       }
//     return 0;
// }


#include<stdio.h>
int main()
{
    int i, j,c,a,b;
    printf("Enter the range: ");
    scanf("%d %d",&a, &b);
    for(i=a;i<=b;i++)
    {
        c=0;
        for(j=1;j<=i;j++)
        {
            if(i%j==0)
            c++;
        }
        if(c==2)
        printf("%d\n",i);
    }
    
    return 0;
}