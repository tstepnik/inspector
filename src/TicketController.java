import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class TicketController {
    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        LocalDate date = LocalDate.of(2020, 02, 17);
        LocalTime time1 = LocalTime.of(13, 20);
        LocalTime time2 = LocalTime.of(7, 30);
        LocalTime time3 = LocalTime.of(10, 22);
//        LocalTime time4 = LocalTime.of(19, 54);
        Passenger person1 = new Passenger("Jan", "Kowalski");
        Passenger person2 = new Passenger("Marek", "Grabiński");
        Passenger person3 = new Passenger("Kamil", "Jamrożek");
        Passenger person4 = new Passenger("Monika", "Szlufik");
        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.buyTicket(person1, LocalDateTime.of(date, time1), Duration.ofMinutes(20));
        ticketMachine.buyTicket(person2, LocalDateTime.of(date, time2), Duration.ofMinutes(20));
        ticketMachine.buyTicket(person3, LocalDateTime.of(date, time3), Duration.ofMinutes(20));

        passengers.add(person1);
        passengers.add(person2);
        passengers.add(person3);
        passengers.add(person4);
        List<Passenger> passengersWithoutTicket = passengersWithoutTicket(passengers);
        System.out.println(passengersWithoutTicket.size() + " pasażerów nie posiada/ma nieważny bilet: ");
        passengersWithoutTicket.forEach(passenger -> System.out.println(passenger.getFirstName() + " "
                + passenger.getLastName()));
    }

    private static List<Passenger> passengersWithoutTicket(List<Passenger> passengers) {
        List<Passenger> passengersWithoutTicket = new ArrayList<>();
        passengers.forEach(passenger -> {
            if  ( passenger.
                    ticketIsExpired(LocalDateTime.of(2020, 02, 17, 18, 45))) {
                passengersWithoutTicket.add(passenger);
            }
        });
        return passengersWithoutTicket;
    }
}
