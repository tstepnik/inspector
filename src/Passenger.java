import java.time.LocalDateTime;

public class Passenger {
    private String firstName;
    private String lastName;
    private Ticket ticket;


    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Passenger(String firstName, String lastName, Ticket haveTicket) {
        this(firstName, lastName);
        this.ticket = haveTicket;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean haveTicket() {
        if (ticket == null) {
            return false;
        }
        return true;
    }

    public boolean ticketIsExpired(LocalDateTime date) {
        LocalDateTime ticketDateWithDuration =
                ticket.getClipedTicketTime().plusMinutes(ticket.getTicketDuration().toMinutes());
        return date.isAfter(ticketDateWithDuration);
    }


    // czy ma bilet.zwraca boolean
    // czy data biletu + czas trwania jest przed obecną datą

}
