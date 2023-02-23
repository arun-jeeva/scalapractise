class Conversionsc {
  def conv(): Unit = {
    println ("Inches to Feet conversion value of 100 is : " + Conversions.inchestoFeet (100) )
    println ("Miles to Kilometer conversion value of 12 is : " + Conversions.milestoKms (12) )
    println ("Pounds to Kilos conversion value of 30 is : " + Conversions.poundsToKilos (30) )
  }
}
object Conversions {
  def inchestoFeet (value:Int): Double = {
    value/12
  }

  def milestoKms(value: Int): Double = {
    value * 1.609
  }

  def poundsToKilos(value: Int): Double = {
    value / 2.205
  }
}


object Bank {
  def main(args: Array[String]): Unit = {
    val m = new Conversionsc()
    m.conv()
  }
}