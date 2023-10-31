#include <iostream>
using namespace std;

int main()
{

    int rank, percentage,option;
    string per;
    string yn;

    try
    {
        cout << "enter person is engineer or not(eng/others) :" << endl;
        cin >> per;
        if (per == "eng")
        {
            cout << "enter engineering percentage:" << endl;
            cin >> percentage;
            if (percentage > 50)
            {
                cout << "you are eligible for Pre-Cat Exam." << endl;
                cout << "you are going to give Pre-Cat Exam(yes/no):";
                cin >> yn;
                if (yn == "yes")
                {
                    cout << "enter your Pre-Cat Exam rank:";
                    cin >> rank;
                    if (rank<2000)
                    {
                       cout<<"you are eligible for cap round."<<endl;
                    //    cout<<"enter center you want:"<<endl<<"1.acts"<<endl<<"2.sunbeam"<<endl<<"3.sunbeam karad"<<endl<<"4.juhu"<<endl;
                    //    cin>>option;
                    //    switch (option)
                    //    {
                    //    case 1:
                       if(rank<300){
                        cout<<"congratulations !! you got acts."<<endl;
                       }else if (rank<=300&&rank<600)
                       {
                        cout<<"congratulations !! you got sunbeam."<<endl;
                       }
                       else if (rank<=600&&rank<1000)
                       {
                        cout<<"congratulations !! you got sunbeam kard."<<endl;
                       }
                       else if (rank<=1000&&rank<=2000)
                       {
                        cout<<"congratulations !! you got sunbeam."<<endl;
                       }else{
                        cout<<"you can go for other colleges."<<endl;
                       }
                       
                    //     break;
                       
                    //    default:
                    //     break;
                    //    }
                    }
                     else
                {
                    cout<<"better luck next time";
                }
                }
                else
                {
                    throw 505;
                }
            }
            else
            {
                throw 505;
            }
        }
        else
        {
            cout << "enter your percentage:" << endl;
            cin >> percentage;
            if (percentage > 50)
            {
                cout << "you are eligible for Pre-Cat Exam." << endl;
                cout << "you are going to give Pre-Cat Exam(yes/no):";
                cin >> yn;
                if (yn == "yes")
                {
                    cout << "enter your Pre-Cat Exam rank:";
                    cin >> rank;
                    if (rank<2000)
                    {
                       cout<<"you are eligible for cap round.";
                       
                    }
                     else
                {
                    cout<<"better luck next time";
                }
                    
                }
                else
                {
                    throw 505;
                }
            }
            else
            {
                throw 505;
            }
        }
    }
    catch (...)
    {
        cout << "you are not eligible.";
    }

    return 0;
}