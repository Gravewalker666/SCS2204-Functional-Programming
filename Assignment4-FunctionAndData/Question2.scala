class Rational(x: Int, y: Int) {
  def numerator: Int = x;
  def denominator: Int = y;

  def -(r: Rational) = new Rational(this.numerator*r.denominator - this.denominator*r.numerator,
    this.denominator*r.denominator);

  override def toString: String = numerator + "/" + denominator;
}

object Question2 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4);
    val y = new Rational(5, 8);
    val z = new Rational(2, 7);
    println(x-y-z);
  }
}
