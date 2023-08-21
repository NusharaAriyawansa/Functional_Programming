object Q_4 {
    def attendees (ticket_price: Int) : Int = 120 + (15-ticket_price)/5*20
    def revenue (ticket_price: Int) : Int = ticket_price*attendees(ticket_price)
    def cost (ticket_price: Int) : Int = 500 + 3*attendees(ticket_price)
    def profit (ticket_price: Int) : Int = revenue(ticket_price) - cost(ticket_price)

    def main (args: Array[String]) : Unit = {
        var max_profit: Int = 0
        var max_ticket_price: Int = 0
        for (ticket_price <- 1 to 50){
            val current_profit = profit(ticket_price)
            if (current_profit >= max_profit){
                max_profit = current_profit
                max_ticket_price = ticket_price
            } 
        }
        println(s"Maximum profit obtained = Rs. ${max_profit}")
        println(s"Ticket price with the maximum profit = Rs. ${max_ticket_price}")
    }
}

