object Q_3 extends App {
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

        def getBalance: Double = balance
    }

    val account1 = new Account("123V", 1, 1000.0)
    val account2 = new Account("456V", 2, 500.0)

    account1.deposit(200)                           // 1000 + 200 = 1200
    account1.withdraw(100)                          // 1200 - 100 = 1100
    account1.transfer(300, account2)                // 1100 - 300 = 800 && 500 + 300 = 800

    println("Final balances:")
    println(s"Account 1: ${account1.getBalance}")
    println(s"Account 2: ${account2.getBalance}")
}

