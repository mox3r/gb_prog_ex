package Task1;

public class Transaction<T extends Account<?>> {
    private final T from;
    private final T to;
    private final double amount;

    public Transaction(T from, T to, double amount) {
        this.from = from;
        this.to = to;
        this.amount = amount;
    }

    public void execute() {
        if (from.getAmount() >= amount) {
            System.out.printf("Операция прошла успешно! переведено %.2f руб.\n", amount);
            System.out.printf("Счет списания: #%s; %.2f\nСчет зачисления: #%s; %.2f руб.\n",
                    from.getData(), from.getAmount(), to.getData(), to.getAmount());
            from.setAmount(from.getAmount() - amount);
            to.setAmount(to.getAmount() + amount);

            System.out.println("Текущее состояние счетов: \n" + from + "\n" + to);
        } else {
            System.out.println("Недостаточно средств на счете, операция отклонена!");
        }
    }
}
