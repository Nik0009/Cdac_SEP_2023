package Sychronization.bank;

public class Bank {

    public static void main(String[] args) {
        Account acc = new Account();
        Customers c1 = new Customers("ramesh", acc);
        Customers c2 = new Customers("rajesh", acc);

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
