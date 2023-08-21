object Q_5 extends App{
    def isEven (n: Int) : Boolean = n match {
        case 0 => true
        case 1 => false
        case x => isEven(n-2)
    }

    def sum(n: Int) : Int = n match{
        case 0 => 0
        case x if(isEven(x)) => n + sum(n-2)
        case _ => sum(n-1)   
    }

    print(sum(10))

}
