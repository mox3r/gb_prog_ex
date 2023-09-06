using Classes;

// var account = new BankAccount("mox3r", 5000);
// Console.WriteLine($"Аккаунт {account.Number} был создан для {account.Owner} c {account.Balance} начальных средств");

// account.MakeWithdrawal(500, DateTime.Now, "Гулянка");
// Console.WriteLine(account.Balance);
// account.MakeDeposit(400, DateTime.Now, "Не понадобилось");
// Console.WriteLine(account.Balance);
// Console.WriteLine(account.GetAccountHistory());

// // BankAccount invalidAccount;

// try
// {
//     account.MakeWithdrawal(1050, DateTime.Now, "Попытка снять больше");
// }
// catch (InvalidOperationException e)
// {
//     Console.WriteLine("Ошибка. Хочешь слишком многого!");
//     Console.WriteLine(e.ToString());
// }


// try
// {
//     invalidAccount = new BankAccount("invalid", -100);

// }
// catch (ArgumentOutOfRangeException e)
// {
//     Console.WriteLine("Ошибка вызвана попыткой создать аккаунт с отрицательным балансом");
//     Console.WriteLine(e.ToString());
//     return;
// }

// var giftCard = new GiftCardAccount("gift card", 100, 50);
// giftCard.MakeWithdrawal(20, DateTime.Now, "get expensive coffee");
// giftCard.MakeWithdrawal(50, DateTime.Now, "buy groceries");
// giftCard.PerformMonthEndTransactions();
// // can make additional deposits:
// giftCard.MakeDeposit(27.50m, DateTime.Now, "add some additional spending money");
// Console.WriteLine(giftCard.GetAccountHistory());

// var savings = new InterestEarningAccount("savings account", 10000);
// savings.MakeDeposit(750, DateTime.Now, "save some money");
// savings.MakeDeposit(1250, DateTime.Now, "Add more savings");
// savings.MakeWithdrawal(250, DateTime.Now, "Needed to pay monthly bills");
// savings.PerformMonthEndTransactions();
// Console.WriteLine(savings.GetAccountHistory());

var lineOfCredit = new LineOfCreditAccount("line of credit", 0, 2000);
// How much is too much to borrow?
lineOfCredit.MakeWithdrawal(1000m, DateTime.Now, "Take out monthly advance");
lineOfCredit.MakeDeposit(50m, DateTime.Now, "Pay back small amount");
lineOfCredit.MakeWithdrawal(5000m, DateTime.Now, "Emergency funds for repairs");
lineOfCredit.MakeDeposit(150m, DateTime.Now, "Partial restoration on repairs");
lineOfCredit.PerformMonthEndTransactions();
Console.WriteLine(lineOfCredit.GetAccountHistory());