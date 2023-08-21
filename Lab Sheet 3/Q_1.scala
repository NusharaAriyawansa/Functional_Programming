import scala.io.StdIn.readLine

object Q_1 {
    def reverse_string (str: String) : String = {
        if (str.isEmpty())
            ""; 
        else  
            reverse_string(str.tail) + str.head; 
    }
    
    def main (args: Array[String]) : Unit = {
        print("Enter a string : "); 
        var str1 = readLine();
        print("Reversed string : " + reverse_string(str1));
    }
}