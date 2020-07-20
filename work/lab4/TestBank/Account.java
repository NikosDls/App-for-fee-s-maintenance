package testbank;

public class Account {

    private int code;
    private double balance;
    Person tempPerson;

    public Account(int code) {
        this(code, 0.0);
    }

    public Account(int code, double balance) {
        this.code = code;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setOwner(Person other) {
        tempPerson = other;
    }

    public String getOwner() {
        return tempPerson.getName();
    }

    public int getOwnerAge() {
        return tempPerson.getAge();
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.printf("Transaction completed.\n\n");
        } else {
            System.out.printf("You cant withdraw %.2f money.\nYou have only %.2f money.\n\n", amount, balance);
        }
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public double getAccount() {
        return balance;
    }
}
