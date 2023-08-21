object Q_2 {
  def temp_convertor (c: Double): Double = c*1.8000+32.00
  def main(args:Array[String]) : Unit = printf("%.2f", temp_convertor(35)) 
}
