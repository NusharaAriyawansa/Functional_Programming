import scala.io.StdIn.readInt

object Q_3 {
    def wage (working_hours: Int) : Int = working_hours*250
    def OT (ot_hours: Int) : Int = ot_hours*85
    def salary (working_hours: Int, ot_hours: Int) : Int = wage(working_hours) + OT(ot_hours)
    def tax (total_salary: Int) : Double = total_salary*0.12
    def take_home_salary (working_hours: Int, ot_hours: Int) : Double = salary(working_hours, ot_hours) - tax(salary(working_hours, ot_hours))

    def main (args: Array[String]) : Unit = {
        print("Enter the usual working hours: ")
        var x = readInt()
        print("Enter the over-time working hours: ")
        var y = readInt()
        println(s"Take home salary = Rs. ${take_home_salary(x, y)}")    //40, 30
    }
}