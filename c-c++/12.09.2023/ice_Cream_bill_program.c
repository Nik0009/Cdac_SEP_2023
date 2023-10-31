#include<stdio.h>

void main()
{
    int n,q,vic=1000,mic=1000,cic=1000,total=0;
    float gst=1.18;
    printf("\n.......welome to ice cream parlour........\n \t1.vanila ice cream.(price=100)\n \t2.magno ice cream.(price=150)\n \t3.chocolate ice cream.(price=120)\nplease select any option from above:");
    scanf("%d",&n);
    switch (n)
    {
    case 1:
        printf("Enter quantity for vanila ice cream:");
        scanf("%d",&q);
        vic=vic-q;
        total=q*100*gst;
        printf("............................BILL DETAILS............................");
        printf("\n\tice cream name=vanila ice cream\n\tquantity=%d\n\tgst=18\n\ttotal=%d",q,total);
        break;

    case 2:
        printf("Enter quantity for mango ice cream:");
        scanf("%d",&q);
        mic=mic-q;
        total=q*150*gst;
        printf("............................BILL DETAILS............................");
        printf("\n\tice cream name=mango ice cream\n\tquantity=%d\n\tgst=18\n\ttotal=%d",q,total);
        break;

    case 3:
        printf("Enter quantity for chocolate ice cream:");
        scanf("%d",&q);
        cic=cic-q;
        total=q*120*gst;
        printf("............................BILL DETAILS............................");
        printf("\n\tice cream name=chocolate  ice cream\n\tquantity=%d\n\tgst=18\n\ttotal=%d",q,total);
        break;
    
    default:
        printf("Please enter correct option !!!!!!!");
        break;
    }

}