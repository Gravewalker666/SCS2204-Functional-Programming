object Question2 {
  def main(args: Array[String]): Unit = {
    primeSeq(10)
  }

  def primeSeq(number: Int): Unit = {
    var isPrime: Boolean = true;
    if (number == 2) {
      println(number)
      return
    } else if (number < 2) {
      return
    }
    for (i <- 2 to number - 1) {
      if (number % i == 0) {
        isPrime = false;
      }
    }
    if (isPrime) {
      println(number)
    }
    primeSeq(number - 1);
  }
}
