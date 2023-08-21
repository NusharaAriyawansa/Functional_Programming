import scala.io.StdIn.readInt

object Q_2 {
    def PatternMatching (num: Int) = num match {
        case x if x<=0 => "Negative or zero"; 
        case x if x%2==0 => "Even"; 
        case x if x%2!=0 => "Odd"; 
    }

    def main (args: Array[String]) : Unit = {
        print("Enter a number: "); 
        var input = readInt();
        println(PatternMatching(input));
    }
}