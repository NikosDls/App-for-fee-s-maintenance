package testbank;

public class Person {

    private String name;
    private int age;
    private Account[] accounts = new Account[3];
    private int numberOfAccounts = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void addAccount(int code) {
        if (numberOfAccounts == 3) {
            return;
        }
        accounts[numberOfAccounts] = new Account(code);
        accounts[numberOfAccounts].setOwner(this);
        numberOfAccounts++;
    }
}
