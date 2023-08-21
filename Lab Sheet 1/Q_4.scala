object Q_4 {
  def discounted_price (x: Int): Double = x*24.95*(1-0.4)
  def shipping_cost (x: Int): Double = if (x<=50) x*3.0 else (3.0*50) + 0.75 * (x-50)
  def total_cost(x: Int): Double = discounted_price(x) + shipping_cost(x)

  def main(args:Array[String]) : Unit = println(s"Total cost = Rs. ${total_cost(60)}")
}