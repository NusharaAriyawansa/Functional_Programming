object Q_5 {
  def total_running_time (easy_pace: Int, tempo: Int): Int = (easy_pace*8) + (tempo*7)
  def main(args:Array[String]) : Unit = println(total_running_time(4, 3))
}