class AccountInfo (val balance : Int){

  def deposit(): Unit ={
    println("You are inside deposit method and your balance : " + balance)
  }
  def withdraw(): Unit ={
    println("You are inside withdraw method and your balance : " + balance)
  }

}

object TestAccountInfo {
  def main(args: Array[String]): Unit = {
    val Acc = new AccountInfo(1000)
    Acc.deposit()
    Acc.withdraw()
  }
}

