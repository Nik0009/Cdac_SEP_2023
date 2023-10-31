#include <iostream>
using namespace std;

class student
{
protected:
    // int id;
    // char name[20];
    int roll_no;

public:
    int get()
    {
        // cout << "Enter student details"<<endl;
        // cout << "enter student id:" << endl;
        // cin >> id;

        // cout << "enter student name:" << endl;
        // cin >> name;

        cout << "enter student roll no:" << endl;
        cin >> roll_no;

        return 0;
    }
    int put()
    {
        cout << "Student details:" << endl;
        // cout << "student id:" << id << endl;
        // cout << "student name:" << name << endl;

        cout<<"studet roll no is "<<roll_no;
        return 0;
    }
};

class test : public student
{
protected:
    int t1, t2, t3;

public:
    int getTest()
    {

        get();
        cout << "Enter test details" << endl;
        cout << "enter subject-1 marks;";
        cin >> t1;
        cout << "enter subject-2 marks:";
        cin >> t2;
        cout << "enter subject-3: marks";
        cin >> t3;
        return 0;
    }

    int putTest()
    {
        put();
        cout << "subject-1:" << t1 << endl;
        cout << "subject-2:" << t2 << endl;
        cout << "subject-3:" << t3 << endl;
        return 0;
    }
};

class sport
{
protected:
    int s1, s2, s3;

public:
    int getSport()
    {
        cout << "Enter sport details" << endl;
        cout << "enter marks in sport-1:";
        cin >> s1;
        cout << "enter marks in sport-2:";
        cin >> s2;
        cout << "enter marks in sport-3:";
        cin >> s3;
        return 0;
    }

    int putSport()
    {

        cout << "enter marks in sport-1:" << s1 << endl;
        cout << "enter marks in sport-2:" << s2 << endl;
        cout << "enter marks in sport-3:" << s3 << endl;
        return 0;
    }
};

class result : public test, public sport
{
    protected :
    int total;

public:
    int getResult()
    {
        getTest();
        getSport();
        total=t1+t2+t3+s1+s2+s3;

        return 0;
    }

    int putResult()
    {
        cout << "Result :" << endl;
        putTest();
        putSport();
       
        cout<<"Total:"<<total;
        

        return 0;
    }
};

int main()
{
    result r;
    r.getResult();
    r.putResult();

    return 0;
}
