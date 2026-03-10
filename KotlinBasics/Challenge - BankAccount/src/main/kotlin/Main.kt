class Account(val name: String) {
    private var balance = 0.0
    private var transactions = mutableListOf<Transaction>()

    inner class Transaction(val concept: String, val amount: Double){
        init {
            balance += amount
            transactions.add(this)
        }

        override fun toString(): String {
            return "$concept: $amount"
        }
    }

    fun deposit(amount: Double){
        if (amount >= 0) {
            Transaction("Deposit", amount)
        } else {
            println("Amount must be positive")
        }
    }

    fun withdraw(amount: Double){
        if (amount <= balance) {
            Transaction("Withdraw", -amount)
        } else {
            println("Insufficient funds")
        }
    }

    fun recalculateBalance(){
        balance = transactions.sumOf { it.amount }
    }

    fun printStatement(){
        println("Account Statement for $name")
        transactions.forEach { println(it) }
    }

    fun getBalance() = balance
}

fun main() {
    val account = Account("John")
    account.deposit(100.0)
    account.withdraw(50.0)
    account.withdraw(1000.0)
    account.printStatement()
    account.recalculateBalance()
    println("Balance: ${account.getBalance()}")
}