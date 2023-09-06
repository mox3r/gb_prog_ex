using Classes;

public class InterestEarningAccount : BankAccount
{
    public override void PerformMonthEndTransactions()
    {
        if (Balance > 500m)
        {
            decimal interest = Balance * 0.1083333m;
            MakeDeposit(interest, DateTime.Now, "Месячный процент пришел!");
        }
    }
    public InterestEarningAccount(string name, decimal initialBalance) : base(name, initialBalance)
    {
    }
}