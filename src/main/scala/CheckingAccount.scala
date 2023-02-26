class BankAccount (val initBal: Double) {
  var balance: Double = initBal
  def deposit(amount: Double): Double = {
    balance += amount
    balance
  }
  def withdraw(amount: Double): Double = {
    balance -= amount
    balance
  }
}


class CheckingAccount  (override val initBal: Double,val charges:Double) extends BankAccount(initBal) {

  private var initBalval: Double = initBal
  def addcharge(bal1: Double): Double = {
    initBalval = bal1 - charges
    initBalval

  }
}

object Trans {
  def main(args: Array[String]): Unit = {
    var balanceval: Double = 100.00
    val Transact = new CheckingAccount(balanceval,1)
    println("Current Balance :" + balanceval)

    balanceval = Transact.deposit(100)
    println("Current Balance :" + balanceval)
    balanceval = Transact.addcharge(balanceval)
    println("Current Balance after charge:" + balanceval)
    balanceval = Transact.withdraw(50.00)
    println("Current Balance :" + balanceval)
    balanceval = Transact.addcharge(balanceval)
    println("Current Balance after charge :" + balanceval)
  }
}