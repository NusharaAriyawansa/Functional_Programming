object Q_2 extends App {
    class Rational (n: Int, d: Int){
        def numer = n
        def denom = d
        def sub (r: Rational) = new Rational(this.numer*r.denom - r.numer*this.denom, this.denom*r.denom)
        override def toString(): String = numer + "/" + denom
    }

    val obj1 = new Rational(1,2)
    val obj2 = new Rational(3,4)
    val res = obj1.sub(obj2)
    println(res)
}

