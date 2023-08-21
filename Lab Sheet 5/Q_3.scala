object Q_3 extends App{
    def sum(n: Int) : Int = n match{
        case 1 => 1
        case _ => n + sum(n-1)        
    }

    print(sum(5))
}