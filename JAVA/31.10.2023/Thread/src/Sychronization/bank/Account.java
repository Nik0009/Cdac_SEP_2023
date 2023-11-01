package Sychronization.bank;

public class Account {

    private int balance = 10000;

    public boolean isSufficientBalance(int amount) {

        if (balance < amount) {
            return false;
        } else {
            return true;
        }

    }

    public void withdraw(int amount) {
//        if(isSufficientBalance(amount)){
//            balance=balance-amount;
//            System.out.println("Remaining balance is INR "+balance);
//        }
//        else{
//            System.out.println("insufficient balance  ");
//        }

        balance = balance - amount;
        System.out.println("Remaining balance is INR " + balance + " /-");

    }

}
