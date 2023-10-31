
package labtask6;


class Bank {
    // Method in the base class with a default implementation
    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {
    // Overriding the getBalance method for BankA
    @Override
    public int getBalance() {
        return 10000;
    }
}

class BankB extends Bank {
    // Overriding the getBalance method for BankB
    @Override
    public int getBalance() {
        return 15000;
    }
}

class BankC extends Bank {
    // Overriding the getBalance method for BankC
    @Override
    public int getBalance() {
        return 2000;
    }
}

public class Ex3 {
    public static void main(String[] args) {
        // Creating objects of each bank
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        // Calling the getBalance method for each bank and printing the result
        System.out.println("Balance in Bank A: Rs " + bankA.getBalance());
        System.out.println("Balance in Bank B: Rs " + bankB.getBalance());
        System.out.println("Balance in Bank C: Rs " + bankC.getBalance());
    }
}