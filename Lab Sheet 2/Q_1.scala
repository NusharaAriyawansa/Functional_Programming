object Q_1 {
    var k, i, j = 2
    var m, n = 5
    var f = 12.0f
    var g = 4.0f
    var c = 'X'

    def main(args: Array[String]) : Unit = {
        println(k + 12 * m)
        println(m / j)
        println(n % j)
        println(f + 10 * 5 + g)
        i+=1
        println(i*n)
        //println(++i * n)  -> invalid syntax (no increment and decrement operators)
    }
}

/*
                Scala                                               Java
Mixture of both OOP and FP                        A general purpose object oriented language
Variables are by default immutable types          Variables are by default mutable types
Support operator overloading                      Doesn't support operator overloading
Less readable due to nested code                  More readable 
*/