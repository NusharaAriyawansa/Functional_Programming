object Q_1 {
    val calculateInterest = (deposit: Double) => {
        if (deposit <= 20000) deposit*0.02
        else if (deposit <= 200000) deposit*0.04
        else if (deposit <= 2000000) deposit*0.035
        else deposit*0.065
    }    

    def main(args: Array[String]): Unit = {
        var amount = 30000; 
        var interest = calculateInterest(amount); 
        println("Interest = " + "%.2f".format(interest));
    }
}


// val lambda_exp = (variable:Type) => Transformation_Expression

