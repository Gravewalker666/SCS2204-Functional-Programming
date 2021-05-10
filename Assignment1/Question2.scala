import scala.math.pow;

object Question2 {
  final val PHI: Double = 3.14

  def main(args: Array[String]) = {
    print("Volume of a shphere with a radius of 5 is ")
    println(getSphereVolume(5));
  }

  def getSphereVolume(radius: Double): Double = {
    return (pow(radius, 3)*PHI*4)/3
  }
}
