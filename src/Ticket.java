import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private LocalDateTime clipedTicketTime;
    private Duration ticketDuration;

    public Ticket(LocalDateTime clipedTicketTime, Duration ticketDuration) {
        this.clipedTicketTime = clipedTicketTime;
        this.ticketDuration = ticketDuration;
    }

    public LocalDateTime getClipedTicketTime() {
        return clipedTicketTime;
    }

    public void setClipedTicketTime(LocalDateTime clipedTicketTime) {
        this.clipedTicketTime = clipedTicketTime;
    }

    public Duration getTicketDuration() {
        return ticketDuration;
    }

    public void setTicketDuration(Duration ticketDuration) {
        this.ticketDuration = ticketDuration;
    }
}
