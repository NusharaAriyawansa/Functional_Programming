object Q_2 extends App {
    def calculateSquare(numbers: List[Int]): List[Int] = {
        numbers.map(number => number*number)        
    }

    val input_list = List(1, 2, 3, 4, 5)
    val output_list = calculateSquare(input_list)
    println(output_list)
}
