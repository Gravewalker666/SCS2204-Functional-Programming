object Question3 {
  // price with the discount
  final var price = 24.95*0.6

  def main(args: Array[String]): Unit = {
    print("Wholesale price for 60 copies ")
    println(getWholesaleCost(60))
  }

  def getWholesaleCost(copies: Int): Double = {
    if (copies > 50) {
      return price*copies + 3*50 + 0.75*(copies - 50) 
    }
    return price*copies + 3*copies;
  }
}
