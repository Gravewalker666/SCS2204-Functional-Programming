object Question4 {
  def main(args: Array[String]): Unit = {
    println(oddOrEven(6));
  }

  def oddOrEven (number: Int): String = {
    if (number == 1) {
      return "Odd"
    }
    if (number == 0) {
      return "Even"
    }
    return oddOrEven(number%2);
  }
}
