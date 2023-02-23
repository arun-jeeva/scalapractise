class BankAccount (val initBal: Double) {
  var balance: Double = initBal
  def deposit(amount: Double): Unit = {
    balance += amount
  }
  def withdraw(amount: Double): Unit = {
    balance -= amount
  }
}


class CheckingAccount  (override val initBal: Double,val charges:Double) extends BankAccount(initBal) {

  private var initBalval: Double = initBal
  def addcharge(): Unit = {
    initBalval = initBalval + charges
    println("New Balance :" + initBalval )

  }
}

object Trans {
  def main(args: Array[String]): Unit = {
    val balanceval: Double = 100.00
    val Transact = new CheckingAccount(balanceval,1)
    Transact.deposit(100)
    Transact.addcharge()
    Transact.withdraw(50)
    Transact.addcharge()
  }
}