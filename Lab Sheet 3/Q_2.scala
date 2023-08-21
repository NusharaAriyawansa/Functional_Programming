object Q_2 {
    def filter_strings(x: List[String]) : List[String] = x.filter(_.length()>5);

    def main (args : Array[String]) : Unit = {
        var my_list : List[String] = List("apple", "banana","orange", "papaya"); 
        print("Filtered strings : " + filter_strings(my_list)); 
    }
}