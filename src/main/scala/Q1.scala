import scala.io.StdIn.readInt

object Q1 {
  def calculateInterest(d: Int): Double = {
    if(d <= 20000) {
      d * (102 / 100.0)
    }
    else if(d <= 200000) {
      d * (104 / 100.0)
    }
    else if (d <= 2000000) {
      d * (103.5 / 100.0)
    }
    else{
      d * (106.5 / 100.0)
    }
  }

  def main(args: Array[String]): Unit = {
    print("Enter your deposit amount: Rs.")
    val deposit: Int = readInt()
    if (deposit <= 0) {
      System.err.println("Invalid amount")
      System.exit(1)
    }
    val amount = calculateInterest(deposit)
    val interest = amount - deposit
    println(s"After a year,  Deposit Amount: Rs.${"%.2f".format(amount)} & Actual Amount of Interest: Rs.${"%.2f".format(interest)}")

  }
}