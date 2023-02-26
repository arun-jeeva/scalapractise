import scala.io.Source
class Readfile {

}

object fileread {
  def main(args: Array[String]): Unit = {
    /*
    val src = Source.fromFile("src/main/scala/Testing.txt").getLines.toList.reverse
    println("Below is the content from the file ")
    for (line <- src) {
      println(line)
    }
    */

    val fileName = "src/main/scala/Testing.txt"

    // Open the file and get its contents as a string
    val fileContents = Source.fromFile(fileName).mkString

    // Find all words longer than 10 characters
    val longWords = fileContents.split("\\W+").filter(_.length > 10)

    // Print the long words in a single line
    println(longWords.mkString(" "))

  }
}
