object Q_1 extends App {
    def calculateAverage (temps: List[Int]): Double = {
        val farTemps = temps.map(cel => (cel*9/5) + 32)
        val TotalFarTemp = farTemps.reduce ((x,y) => x+y)
        val avFarTem = TotalFarTemp/temps.length.toDouble
        
        avFarTem
    }

    val input_list = List(0, 10, 20, 30)
    println(calculateAverage(input_list))
}
