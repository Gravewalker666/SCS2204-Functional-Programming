import scala.math.pow;
import scala.math.sqrt;

case class Point (var x: Int, var y: Int) {
  def +(point: Point): Point = Point(x + point.x, y + point.y);
  def move(dx: Int, dy: Int) = {
    this.x = this.x + dx;
    this.y = this.y + dy;
  }
  def distance(point: Point): Double = {
    sqrt(pow(point.x - this.x, 2) + pow(point.y - this.y, 2))
  }
  def invert() = {
    val temp = this.x;
    this.x = this.y;
    this.y = temp;
  }
}

object Question1 extends App {
  val point1 = Point(0, 1);
  val point2 = Point(1, 3)
  val point3 = point1 + point2;
  println(point3);

  point3.move(1, 1);
  println(point3);

  println(point3.distance(point1));
  println(point3);

  point3.invert();
  println(point3);
}
