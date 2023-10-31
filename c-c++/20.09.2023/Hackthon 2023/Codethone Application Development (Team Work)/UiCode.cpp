#include <iostream>
using namespace std;

const int MAX_ACCOUNTS = 100;

string accountNumbers[MAX_ACCOUNTS];
string accountHolders[MAX_ACCOUNTS];
double accountBalances[MAX_ACCOUNTS];
int accountCounter = 0;
int loggedInAccountIndex = -1;

class Bank
{
    // private:
    //  int option;
    //  string customer_name, customer_address, customer_contact, account_holder_name;
    //  int intital_deposit = 0, account_balance = 2000000, deposit_amount = 0, withdrawal_amount = 0;
    //  int account_no;
public:
    // int login();
    // void createAccount();
    // void depositCash(int index);
    // void withdrawCash(int index);
    // void displayAccountInfo(int index);1
    // void logout();

    int login()
    {
        string accNum;
        // cout<<".................................................................................";
        // cout<<"*********************************************************************************";
        cout << "\n.............................................................................................\n";
        cout << "\t\t\t\tLogIn";
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tEnter your account number: ";
        cin >> accNum;

        for (int i = 0; i < accountCounter; i++)
        {
            if (accountNumbers[i] == accNum)
            {
                cout << "\n.............................................................................................\n";
                cout << "\t\t\tLogin successful. \n\t\t\tWelcome, " << accountHolders[i] << "!";
                cout << "\n.............................................................................................\n\n\n";
                return i;
            }
        }
        cout << "\t\t\tAccount not found.\n";
        return -1;
    }

    void createAccount()
    {
        if (accountCounter >= MAX_ACCOUNTS)
        {
            cout << "\n.............................................................................................\n";
            cout << "\t\t\t\tSorry, we can't create more accounts.\n";
            cout << "\n.............................................................................................\n\n\n";
            return;
        }
       cout << "\n.............................................................................................\n";
        cout<< "\t\t\t\tCreating New Account ";
        cout << "\n.............................................................................................\n";
        cout << endl
             << "\t\t\tEnter your name: ";
        cin >> accountHolders[accountCounter];
        accountNumbers[accountCounter] = "ACC" + to_string(accountCounter + 1);
        cout << "\t\t\tYour account number is: " << accountNumbers[accountCounter] << "\n";
        cout << "\t\t\tEnter initial deposit: ";
        cin >> accountBalances[accountCounter];
        cout << "\n\t\t\tCongratulations !! \n\t\t\tYour Account Has Created Successfully!!\n"
             << endl;
        accountCounter++;
    }

    void depositCash(int index)
    {
        double amount;
        cout << "\n.............................................................................................\n";
        cout << "\t\t\t\tCash Deposite";
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tEnter the amount to deposit: ";
        cin >> amount;

        if (amount <= 0)
        {
            cout << "\n.............................................................................................\n";
            cout << "\t\t\tInvalid deposit amount.\n";
            cout << "\n.............................................................................................\n";
            return;
        }

        accountBalances[index] += amount;
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tDeposit successful. \n\t\t\tNew balance: " << accountBalances[index] << "";
        cout << "\n.............................................................................................\n\n\n";
    }

    void withdrawCash(int index)
    {
        double amount;
        cout << "\n.............................................................................................\n";
        cout << "\t\t\t\tCash Withdrawal";
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tEnter the amount to withdraw: ";
        cin >> amount;

        if (amount <= 0 || amount > accountBalances[index])
        {
            cout << "\n.............................................................................................\n";
            cout << "\t\t\tInvalid withdrawal amount or insufficient funds.\n";
            cout << "\n.............................................................................................\n\n\n";
            return;
        }

        accountBalances[index] -= amount;
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tWithdrawal successful. \n\t\t\tNew balance: " << accountBalances[index] << "\n";
        cout << "\n.............................................................................................\n\n\n";
    }

    void displayAccountInfo(int index)
    {
        cout << "\n.............................................................................................\n";
        cout << "\t\t\t\tDisplaying Account Information";
        cout << "\n.............................................................................................\n";
        cout << "\t\t\tAccount Number: " << accountNumbers[index] << "\n";
        cout << "\t\t\tAccount Holder Name: " << accountHolders[index] << "\n";
        cout << "\t\t\tCurrent Balance: " << accountBalances[index] << "\n\n\n";
    }

    // functions to create account
    // void createNewAccount()
    // {
    //     cout << ".................................Create New Account................................." << endl;
    //     cout << "Name of Customer:" << endl;
    //     cin >> customer_name;

    //     cout << "Address of Customer:" << endl;
    //     cin >> customer_address;

    //     cout << "Contact:" << endl;
    //     cin >> customer_contact;

    //     cout << "Initial Deposit:" << endl;
    //     cin >> intital_deposit;

    //     cout << "Your Account Has Created." << endl;
    // }

    // functions to login account
    // void login()
    // {
    //     cout << ".................................login into account................................." << endl;

    // }

    // functions to deposite cash in account
    // void cashDeposite()
    // {
    //     cout << endl<<".................................Cash Deposite................................." << endl;
    //     cout << "Enter Account Holder's Name:";
    //     cin >> account_holder_name;

    //     cout << "Enter Account Number:";
    //     cin >> account_no;

    //     cout << "Enter Deposite Amount:";
    //     cin >> deposit_amount;

    //     if (deposit_amount <= 0)
    //     {
    //         cout << "Invalid deposit amount !!!!!!" << endl;
    //     }
    //     else
    //     {
    //         cout << "You Have Deposited Rs." << deposit_amount << " Amount.";
    //     }
    // }

    // functions to Withdrawal cash from account
    // void cashWithdrawal()
    // {
    //     cout << ".................................Cash Withdrawal................................." << endl;
    //     cout << "Enter Cash Withdrawal Amount:";
    //     cin >> withdrawal_amount;

    //     if (withdrawal_amount <= account_balance)
    //     {
    //         cout << "Insufficient funds or invalid withdrawal amount";
    //     }
    //     else
    //     {
    //         account_balance = account_balance - withdrawal_amount;
    //     }

    //     cout << "You Have Withdrawal Rs." << withdrawal_amount << "Amount.";
    // }

    // functions to Displaying Account Information
    // void displayAccInfo()
    // {
    //     cout << ".................................Displaying Account Information................................." << endl;
    //     cout << "Account Number:"<<endl;
    //     cout << "Account Holder's Name:"<<endl;
    //     cout << "Current Account Balance:"<<account_balance<<endl;
    // }

    // logout from account
    //     void logout()
    //     {
    //         cout << ".................................logout from account................................." << endl;
    //     }
};

int main()
{
    int option;
    // string customer_name, customer_address, customer_contact, account_holder_name;
    // int intital_deposit = 0, account_balance = 2000000, deposit_amount = 0, withdrawal_amount = 0;
    // int account_no;

    Bank customer;

    do
    {
        cout << ".............................................................................................\n";
        cout << "....................................Simple Banking System...................................." << endl;
        cout << ".............................................................................................\n";
        cout << "\n\t1.Create New Account.\n\t2.LogIn\n\t3.Cash Deposite.\n\t4.Cash Withdrawal.\n\t5.Displaying Account Information.\n\t6.LogOut.\n\t";

        if (loggedInAccountIndex != -1)
        {
            cout << "\n.............................................................................................\n";
            cout << "\t\t\t\tLogged in as: " << accountHolders[loggedInAccountIndex] << " (" << accountNumbers[loggedInAccountIndex] << ")\n";
            cout << ".............................................................................................\n";
        }

        cout << "Please Enter Any Option From Above:";
        cin >> option;

        switch (option)
        {
        case 1:
            // customer.createNewAccount();
            customer.createAccount();

            break;

        case 2:
            // customer.login();
            loggedInAccountIndex = customer.login();
            break;

        case 3:
            // customer.cashDeposite();
            if (loggedInAccountIndex != -1)
            {
                customer.depositCash(loggedInAccountIndex);
            }
            else
            {
                cout << ".............................................................................................\n";
                cout << "\t\t\t\tPlease log in first.\n";
                cout << ".............................................................................................\n";
            }
            break;

        case 4:
            // customer.cashWithdrawal();
            if (loggedInAccountIndex != -1)
            {
                customer.withdrawCash(loggedInAccountIndex);
            }
            else
            {
                cout << "\n.............................................................................................\n";
                cout << "\t\t\t\tPlease log in first.\n";
                cout << "\n.............................................................................................\n";
            }
            break;

        case 5:
            //  customer.displayAccInfo();
            if (loggedInAccountIndex != -1)
            {
                customer.displayAccountInfo(loggedInAccountIndex);
            }
            else
            {
                cout << "\n.............................................................................................\n";
                cout << "\t\t\t\tPlease log in first.\n";
                cout << "\n.............................................................................................\n";
            }
            break;
        case 6:
            // customer.logout();
            loggedInAccountIndex = -1; // Logout
            cout << "\n.............................................................................................\n";
            cout << "\t\t\tLogged out. \n\t\t\tGoodbye! Thank You For Visiting !!";
            cout << "\n.............................................................................................\n";
            break;

        default:
        cout << "\n.............................................................................................\n";
            printf("\t\t\t\tPlease enter correct option from above.");
            cout << "\n.............................................................................................\n\n\n";
            break;
        }
    } while (option != 0);

    return 0;
}
