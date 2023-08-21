import scala.io.StdIn.readInt

object Q_1 {
    def calculate_interest (deposit : Int) : Double = deposit match{
        case x if x<= 20000 => x*0.02;
        case x if x<= 200000 => x*0.04;
        case x if x<= 2000000 => x*0.035; 
        case x if x<= 20000000 => x*0.065;
    }

    def main (args: Array[String]) : Unit = {
        print("Enter depositing amount : "); 
        var amount = readInt(); 
        var interest = calculate_interest(amount); 
        println("Interest = " + "%.2f".format(interest));
    }
}

//30,000/= -> 1,200/=
//300,000/= -> 10,500/=
//3,000,000/= -> 195,000/=
//30,000,000/= -> 1,950,000/=