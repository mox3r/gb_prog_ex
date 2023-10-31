package Task1;

public class Prog {
    public static void main(String[] args) {
        var per1 = new Person("Fio #1", "10000024523");
        var ent1 = new Entity("Entity #1", "1000243654");

        var credAcc1 = new CreditAccout<Person>(per1, 1000);
        var debAcc1 = new DebitAccount<Entity>(ent1, 10000000);

        var transaction = new Transaction<>(debAcc1, credAcc1, 50000);

        transaction.execute();
        System.out.println("\n" + "*".repeat(50) + "\n");
        transaction.execute();

        // var acc1 = new Account<Person>(person, 100000);
        // System.out.println(acc1);
    }
}
