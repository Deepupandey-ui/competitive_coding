
import java.util.Scanner;

abstract class Ticket {
    String ticketType;

    Ticket(String ticketType) {
        this.ticketType = ticketType;
    }

    abstract void calculateFare(int distance);
}

class BusTicket extends Ticket {
    BusTicket(String ticketType) {
        super(ticketType);
    }

    void calculateFare(int distance) {
        int fare = distance * 5;
        System.out.println("Ticket Type: Bus Ticket");
        System.out.println("Fare: " + fare);
    }
}

class TrainTicket extends Ticket {
    TrainTicket(String ticketType) {
        super(ticketType);
    }

    void calculateFare(int distance) {
        int fare = distance * 8;
        System.out.println("Ticket Type: Train Ticket");
        System.out.println("Fare: " + fare);
    }
}

class FlightTicket extends Ticket {
    FlightTicket(String ticketType) {
        super(ticketType);
    }

    void calculateFare(int distance) {
        int fare = distance * 15;
        System.out.println("Ticket Type: Flight Ticket");
        System.out.println("Fare: " + fare);
    }
}

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String type = sc.next();
        int distance = sc.nextInt();

        Ticket t;

        if (type.equalsIgnoreCase("bus")) {
            t = new BusTicket(type);
        }
        else if (type.equalsIgnoreCase("train")) {
            t = new TrainTicket(type);
        }
        else {
            t = new FlightTicket(type);
        }

        t.calculateFare(distance);
    }
}
