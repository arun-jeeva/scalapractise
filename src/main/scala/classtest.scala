class classtest (var bal: Double) {
  def inc(): Double = {
   bal += 2
    bal
  }
}

object classmn {
  def main(args: Array[String]): Unit = {
    var bal1 = 10.00
    val cls = new classtest(bal1)
    bal1 = cls.inc()
    
  }
}