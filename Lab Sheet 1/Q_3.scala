object Q_3 {
  def volume(r: Double): Double = (4.0/3.0)*math.Pi*r*r*r
  def main(args:Array[String]) : Unit = printf("%.2f", volume(5))
}