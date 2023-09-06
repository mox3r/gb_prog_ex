using Classes;

public class LineOfCreditAccount : BankAccount
{ 
    public LineOfCreditAccount(string name, decimal initialBalance, decimal creditLimit) : base(name, initialBalance, -creditLimit)
    {
    }

    public override void PerformMonthEndTransactions()
    {
        if (Balance < 0m)
        {
            decimal interest = -Balance * 0.015m;
            MakeWithdrawal(interest, DateTime.Now, "Проценты по задолженности уплачены!");
        }
    }

    protected override Transaction? CheckWithdrawalLimit(bool isOverdrawn) =>
    isOverdrawn
    ? new Transaction (-20, DateTime.Now, "Овердрафт одобрен, комиссия 20")
    : default;


}