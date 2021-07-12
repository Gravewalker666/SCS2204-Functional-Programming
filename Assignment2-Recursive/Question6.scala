object Question6 {
  def main(args: Array[String]): Unit = {
    printFibo(10)
  }

  def printFibo(number: Int): Unit = {
    for (i <- 0 to number) {
      println(fibonacci(i))
    }
  }

  def fibonacci(number: Int): Int = {
    if (number == 0 || number == 1) {
      return number;
    }
    fibonacci(number - 2) + fibonacci(number - 1)
  }
}
