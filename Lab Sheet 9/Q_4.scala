object Q_4 extends App {
    class Account(val NIC: String, val accNo: Int, var balance: Double){
        
        def deposit(amount: Double): Unit = {
            if (amount > 0) {
                balance += amount
                println(s"Deposited $amount. New balance: $balance")
            } else {
                println("Invalid deposit amount.")
            }
        }
        
        def withdraw(amount: Double): Unit = {
            if (amount > 0 && amount <= balance) {
                balance -= amount
                println(s"Withdrew $amount. New balance: $balance")
            } else {
                println("Invalid withdrawal amount.")
            }
        }
        
        def transfer(amount: Double, targetAccount: Account): Unit = {
            if (amount > 0 && amount <= balance) {
                balance -= amount
                targetAccount.deposit(amount)
                println(s"Transferred $amount to target account.")
            } else {
                println("Invalid transfer amount.")
            }
        }

        def applyInterest(): Unit = {
            if (balance > 0) {
                balance += balance * 0.05
            } else {
                balance += balance * 0.1
            }
        }

        def getBalance: Double = balance
    }

    class Bank(accounts: List[Account]) {
        def accountsWithNegativeBalance: List[Account] = accounts.filter(_.getBalance < 0)
        def calculateTotalBalance: Double = accounts.map(_.getBalance).sum
        def applyInterestToAccounts() = accounts.foreach(_.applyInterest())
        def printAccountBalances() = accounts.foreach(account => println(s"Account balance: ${account.getBalance}"))
    }

    val account1 = new Account("123V", 1, 1000.0)
    val account2 = new Account("456V", 2, 500.0)
    val account3 = new Account("789", 2, -200.0)

    val bank = new Bank(List(account1, account2, account3))

    bank.accountsWithNegativeBalance.foreach(account => println(s"Accounts with negative balances: ${account.NIC}"))
    
    val totalBalance = bank.calculateTotalBalance
    println(s"Total balance of all accounts: $totalBalance")

    bank.applyInterestToAccounts()
    println("Final balances after applying interest:")
    bank.printAccountBalances()
}

