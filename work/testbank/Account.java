package testbank;

public class Account {

    private String code;
    private double balance;
    Person owner;

    //constructor  
    public Account() {
        code = "";
        owner = new Person();
        balance = 0.0;
    }

    public void setCode(String c) {
        code = c;
    }

    public String getCode() {
        return code;
    }

    // setter kai getter methods gia ton katoxo toy logariasmoy 
    public void setOwner(Person p) {
        owner = p;
    }

    public Person getOwner() {
        return owner;
    }

    //methodos getBalance 
    public double getBalance() {
        return balance;
    }

    //methodos withdraw 
    //An i analipsi ginei epistrefei true alliws false 
    public boolean withdraw(double money) {
        if (money <= balance) {
            balance -= money;
            return true;
        }
        return false;
    }

    //An to poso einai thetiko ginetai i katathesi kai 
    //epistrefetai true, diaforetika epistrefetai false 
    public boolean deposit(double money) {
        if (money >= 0) {
            balance += money;
            return true;
        }
        return false;
    }
}
