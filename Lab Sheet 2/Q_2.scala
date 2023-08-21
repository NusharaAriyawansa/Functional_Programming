object Q_2 {
    var a: Int = 2
    var b: Int = 3
    var c: Int = 4
    var d: Int = 5
    var k: Float = 4.3f

    def main(args: Array[String]) : Unit = {
        //println(--b*a+c*d--) -> invalid syntax 
        b-=1
        println(b*a+c*d)
        d-=1

        //println(a++) -> invalid syntax 
        println(a)
        a+=1

        //println(-2 * ( g - k ) +c) -> 'g' is not defined 
        var g: Double = 4.0f 
        println(-2 * ( g - k ) +c)

        //println(c=c++) -> invalid syntax 
        println(c)
        c+=1

        //println (c=++c*a++) -> invalid syntax 
        c+=1
        println (c*a)
        a+=1
    }

}