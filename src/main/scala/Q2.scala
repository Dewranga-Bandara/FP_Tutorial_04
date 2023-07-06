import scala.io.StdIn.readInt

object Q2 {
  def checkNum(number: Int): Unit = number match {
    case num if num <= 0 => println("Negative/Zero is input")
    case num if num % 2 == 0 => println("Even number is given")
    case num if num % 2 != 0 => println("Odd number is given")
  }

  def main(args: Array[String]): Unit = {
    print("Enter your number: ")
    val input = readInt()
    checkNum(input)
  }
}

