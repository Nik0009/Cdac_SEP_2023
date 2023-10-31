
class Bank {

    public int getBalance() {
        return 0;
    }
}

class BankA extends Bank {

    @Override
    public int getBalance() {
        return 10000;
    }
}

class BankB extends Bank {

    @Override
    public int getBalance() {
        return 15000;
    }
}

class BankC extends Bank {

    @Override
    public int getBalance() {
        return 2000;
    }
}

public class Ex3 {

    public static void main(String[] args) {
        BankA bankA = new BankA();
        System.out.println("Balance in Bank A: Rs " + bankA.getBalance());

        BankB bankB = new BankB();
        System.out.println("Balance in Bank B: Rs " + bankB.getBalance());

        BankC bankC = new BankC();
        System.out.println("Balance in Bank C: Rs " + bankC.getBalance());
    }
}
