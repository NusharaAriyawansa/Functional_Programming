object Q_4 extends App{
    def isEven (n: Int) : Boolean = n match {
        case 0 => true
        case 1 => false
        case x => isEven(n-2)
    }

    def isOdd (n: Int) : Boolean = n match {
        case 0 => false
        case 1 => true
        case x => isOdd(n-2)
    }

    print(isEven(8))
    print("\n")
    print(isOdd(8))

}