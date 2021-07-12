object Question5 {
  def main(args: Array[String]): Unit = {
    print(sumOfEven(7))
  }

  def sumOfEven (number: Int): Int = {
    if (number == 0) {
      return number;
    }
    if (number % 2 == 0) {
      return sumOfEven(number - 1) + number;
    } else {
      return sumOfEven(number - 1);
    }
  }
}
