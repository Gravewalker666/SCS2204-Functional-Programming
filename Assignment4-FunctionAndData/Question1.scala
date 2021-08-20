class Rational(x: Int, y: Int) {
  def numerator: Int = x;
  def denominator: Int = y;

  def neg = new Rational(-this.numerator, this.denominator);

  def -(r: Rational) = new Rational(this.numerator*r.denominator - this.denominator*r.numerator,
    this.denominator*r.denominator);

  override def toString: String = numerator + "/" + denominator;
}

object Question1 {
  def main(args: Array[String]): Unit = {
    val x = new Rational(3, 4);
    println(x.neg);
    val y = new Rational(5, 8);
    println(x-y);
  }
}
