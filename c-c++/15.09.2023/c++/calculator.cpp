// 3.WAP for addition, subtraction, multiplication and division using switch case
#include<iostream>
using namespace std;
int main()
{
    int n,a,b,c;
    cout<<"...............menu.................."<<endl;
    cout<<"1.sum"<<endl<<"2.sub"<<endl<<"3.mul"<<endl<<"4.div"<<endl<<"5.mod"<<endl;
    cout<<"enter any above option:";
    cin>>n;
    switch (n)
    {
    case 1:
        
        cout<<"enter two number:";
        cin>>a>>b;
        c=a+b;
        cout<<"sum="<<c;
        break;
    case 2:
        
        cout<<"enter two number:";
        cin>>a>>b;
         c=a-b;
        cout<<"sub="<<c;
        break;

    case 3:
        
        cout<<"enter two number:";
        cin>>a>>b;
        c=a*b;
        cout<<"mul="<<c;
        break;
    
    case 4:
        
        cout<<"enter two number:";
        cin>>a>>b;
         c=a/b;
        cout<<"div="<<c;
        break;
    
    case 5:
       
        cout<<"enter two number:";
        cin>>a>>b;
         c=a%b;
        cout<<"mod="<<c;
        break;

    default:
        cout<<"enter valid no.";
        break;
    }
    return 0;
}