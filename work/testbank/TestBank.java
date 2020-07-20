package testbank;

public class TestBank {

    public static void main(String[] args) {

        Person pers1 = new Person();
        pers1.setName("George");
        pers1.setAge(33);

        Person pers2 = new Person();
        pers2.setName("Natalia");
        pers2.setAge(31);

        Account ac1 = new Account();
        Account ac2 = new Account();
        Account ac3 = new Account();

        //Sto logariasmo ac1 kai ac2 dikaiouxo einai o George 
        //Sto logariasmo ac3 dikaiouxos einai h Natalie 
        //Oi akolouthes kliseis dhmiourgoun aytes tis syndeseis 
        pers1.setAccount(0, ac1);
        pers1.setAccount(1, ac2);

        ac1.setOwner(pers1);
        ac2.setOwner(pers1);

        pers2.setAccount(0, ac3);
        ac3.setOwner(pers2);

        // kiniseis logmoy George 
        ac1.deposit(10000);
        ac1.withdraw(5000);

        ac1.withdraw(6000);

        ac2.deposit(7000);

        ac3.deposit(1000);
        ac3.withdraw(500);

        //To array a tha exei toys logariasmous toy George 
        Account[] a = pers1.getAccount();
        System.out.println("Total accounts for George:");
        int total = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != null) {
                total += a[i].getBalance();
            }
        }
        System.out.println(total);

    }
}
