#include<stdio.h>

void main()
{
    int n,q,total=0;
    float gst=1.18;
    printf("\n.......welome to ice cream parlour........\n \t1.vanila ice cream.(price=100)\n \t2.magno ice cream.(price=150)\n \t3.chocolate ice cream.(price=120)\nplease select any option from above:");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        printf("vanila ");
        break;

    case 2:
        printf("mango ");
        break;

    case 3:
        printf("chocolate ");
        break;
    
    default:
        printf("Please enter correct option !!!!!!!");
        break;
    }
        printf("Enter quantity for ice cream:");
        scanf("%d",&q);
        total=q*100*gst;
        printf("............................BILL DETAILS............................");
        printf("\n\tice cream name=%d\n\tquantity=%d\n\tgst=18\n\ttotal=%d",q,total);

}