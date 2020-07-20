package testbank;

public class TestBank {

    public static void main(String[] args) {

        Person person1 = new Person("George", 20);
        Person person2 = new Person("Natalia", 19);

        Account acc1 = new Account(10001);
        Account acc2 = new Account(20001);
        Account acc3 = new Account(20002);

        acc1.setOwner(person1);
        acc2.setOwner(person1);
        acc3.setOwner(person2);

        acc1.deposit(10000.0);
        acc1.withdraw(5000.0);
        acc1.withdraw(6000.0);

        acc2.deposit(870.0);
        acc2.withdraw(850.5);

        acc3.deposit(45.0);
        acc3.withdraw(32.8);
        acc3.withdraw(49.0);

        System.out.printf("\n\n==========\nAccount owner: %s\nOwner age: %d\nAccount Password: %d\nBalance: %.2f\n==========", acc1.getOwner(), acc1.getOwnerAge(), acc1.getCode(), acc1.getAccount());
        System.out.printf("\n\n==========\nAccount owner: %s\nOwner age: %d\nAccount Password: %d\nBalance: %.2f\n==========", acc2.getOwner(), acc2.getOwnerAge(), acc2.getCode(), acc2.getAccount());
        System.out.printf("\n\n==========\nAccount owner: %s\nOwner age: %d\nAccount Password: %d\nBalance: %.2f\n==========", acc3.getOwner(), acc3.getOwnerAge(), acc3.getCode(), acc3.getAccount());

    }
}
