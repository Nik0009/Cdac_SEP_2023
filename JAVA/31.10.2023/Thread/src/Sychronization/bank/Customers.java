package Sychronization.bank;

import java.util.Scanner;

public class Customers implements Runnable {

    private String name;
    private Account account;

    public Customers(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    @Override
    public void run() {

        synchronized (account) {
            Scanner sc = new Scanner(System.in);
            System.out.println("mr " + name + " enter amount to withdraw: ");
            int amount = sc.nextInt();

            if (account.isSufficientBalance(amount)) {
                System.out.println(this.name + " is going to withdraw INR " + amount);
                account.withdraw(amount);
            } else {
                System.out.println("insufficent balance..!!");

            }
        }

    }
}
