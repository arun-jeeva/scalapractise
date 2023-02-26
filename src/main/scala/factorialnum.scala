import scala.io.StdIn.readInt
class factorialnum {

}




/*testing */
object Solution {
  def main(args: Array[String]): Unit = {
    print("Enter the number to find the Factorial : ")
    val num_1: Int = {
      readInt()
    }
    println("The factorial of "+num_1+" Is : " + factorial(num_1) )

  }
  def factorial(n: Int): Int = {
    if (n <= 0) 1 else (1 to n).reduceLeft(_ * _)
  }
}
