object Q_3 {
    def arithmetic_mean (x: Int, y: Int): Float = {
        var mean = (x+y).toFloat/2;
        BigDecimal(mean).setScale(2, BigDecimal.RoundingMode.HALF_UP).toFloat; 
    }
        
    def main (args: Array[String]) : Unit = {
        var num1 = 15; 
        var num2 = 8; 
        var result = arithmetic_mean(num1, num2);
        println("Arithmetic mean = " + "%.2f".format(result));
    }
}