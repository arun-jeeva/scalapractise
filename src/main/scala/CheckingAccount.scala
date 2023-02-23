class BankAccount (val initBal: Double) {
  private var balance = initBal
  def deposit(amount: Double) = {
    balance += amount
    println(balance)
  }
  def withdraw(amount: Double) = {
    balance -= amount
    println(balance)
  }
}


class CheckingAccount  (override val initBal: Double,val charges:Double) extends BankAccount(initBal) {

  var initBalval: Double = initBal
  def addcharge(charge: Int): Unit = {
    initBalval = initBalval + charge
    println("New Balance :" + initBalval )

  }
}

object Trans {
  def main(args: Array[String]): Unit = {
    val Transact = new CheckingAccount(10,1)
    Transact.addcharge(1)
    Transact.deposit(100)
    Transact.addcharge(1)
    Transact.withdraw(50)
    Transact.addcharge(1)
  }
}