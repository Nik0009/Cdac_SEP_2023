
package lab.task;
class Account{
    int accNo;
    String accType;
    
    Account(int an){
        accNo=an;
        accType="Saving";
    }
    
    Account(int accNo,String accType){
        this.accNo=accNo;
        this.accType=accType;
    }
    
    void displayInfo(){
        System.out.println("Your account no is "+accNo+" and nelongs to "+accType+" category.");
    }
    
}

public class BankAccount {
    public static void main(String [] args){
        Account ac=new Account(123456 );
        ac.displayInfo();
        Account ac1=new Account(123456 ,"current");
        ac1.displayInfo();
        
    
    }
}
