package testbank;

public class Person {

    private String name;
    private int age;
    private final int MAX_ACCOUNTS = 10;
    private Account accounts[] = new Account[MAX_ACCOUNTS];

    public Person() {
        age = 0;
        name = "";
    }

    //set kai get methods gia to name 
    public void setName(String s) {
        name = s;

    }

    public String getName() {
        return name;
    }
    //set kai get methods gia to age 

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    //indexed setter kai getter methods gia ton pinaka accounts 
    public void setAccount(int index, Account a) {
        if (index >= 0 && index < MAX_ACCOUNTS) {
            accounts[index] = a;
        }
    }

    public Account getAccount(int index) {
        //an o index einai metaxy 0 kai MAX_ACCOUNTS 
        //epestrepse ton account pou vrisketai sti thesi index 

        if (index >= 0 && index < MAX_ACCOUNTS) {
            return accounts[index];
        } //diaforetika epestrepse null 
        else {
            return null;
        }
    }

    //oxi indexed setter kai getter methods gia ton pinaka accounts 
    public void setAccount(Account[] a) {
        accounts = a;
    }

    public Account[] getAccount() {
        return accounts;
    }
}
