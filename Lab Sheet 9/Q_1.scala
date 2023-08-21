object Q_2 extends App {
    class Rational (n: Int, d: Int){
        def numer = n
        def denom = d
        def neg = new Rational(-this.numer, this.denom)
        override def toString(): String = numer + "/" + denom
    }

    val obj = new Rational(3,4)
    println(obj.neg)
}

