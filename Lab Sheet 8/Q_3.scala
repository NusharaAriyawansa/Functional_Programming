object Q_3 {
  val toUpper = (str: String) => str.toUpperCase()
  val toLower = (str: String) => str.toLowerCase()
  val formatNames = (str: String, func: String => String) => func(str)
 
  def main(args: Array[String]): Unit = {
    
    var name1 = "Benney"
    var name2 = "Niroshan"
    var name3 = "Saman"
    var name4 = "Kumara"
    
    println(formatNames(name1, toUpper))
    println(formatNames(name2.take(2), toUpper) + name2.drop(2)) 
    println(formatNames(name3, toLower))
    println(name4.dropRight(1) + formatNames(name4.takeRight(1), toUpper))
  }
}
