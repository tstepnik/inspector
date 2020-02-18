import java.time.Duration;
import java.time.LocalDateTime;

public class TicketMachine {

    public void buyTicket(Passenger person,LocalDateTime dateOfPurchase, Duration ticketDuration){
        Ticket ticket = new Ticket(dateOfPurchase,ticketDuration);
        person.setTicket(ticket);
    }
}
