// stdu clss id ,name get fut to input,put to disply-base class
// class science data members three subjects-s1,s2,s3; array or string;getin() and putin() funt.
// class commerce - char c1[20],c2[20],c3[20];intput().output()

#include <iostream>
using namespace std;

class student
{
private:
    int id;
    char name[20];

public:
    int get()
    {
        cout << "enter student id:" << endl;
        cin >> id;

        cout << "enter student name:" << endl;
        cin >> name;
        return 0;
    }
    int put()
    {
        cout << "Student details:" << endl;
        cout << "student id:" << id << endl;
        cout << "student name:" << name << endl;
        return 0;
    }
};

class science : public student
{
private:
    char s1[20], s2[20], s3[20];

public:
    int getin()
    {
        
        cout << "enter science stdunet details:"<<endl;
        get();
        cout << "enter subject-1;";
        cin >> s1;
        cout << "enter subject-2:";
        cin >> s2;
        cout << "enter subject-3:";
        cin >> s3;
        return 0;
    }

    int putin()
    {
        put();
        cout << "subject-1:" << s1 << endl;
        cout << "subject-2:" << s2 << endl;
        cout << "subject-3:" << s3 << endl;
        return 0;
    }
};

class commerce : public student
{
private:
    char c1[20], c2[20], c3[20];

public:
    int input()
    {
        cout << "enter commers studnet details:"<<endl;
        get();
        cout << "enter subject-1:";
        cin >> c1;
        cout << "enter subject-2:";
        cin >> c2;
        cout << "enter subject-3:";
        cin >> c3;
        return 0;
    }

    int output()
    {
        put();
        cout << "subject-1:" << c1 << endl;
        cout << "subject-2:" << c2 << endl;
        cout << "subject-3:" << c3 << endl;
        return 0;
    }
};

int main()
{
    science s;
    s.getin();
    s.putin();

    commerce c;
    c.input();
    c.output();

    return 0;
}