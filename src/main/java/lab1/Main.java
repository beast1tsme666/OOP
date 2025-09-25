package lab1;

public class Main {
    public static void main(String[] args) {
        Airplane boeing = new Airplane("Boeing 737","MN777", 4);
        Flight flight1 = new Flight("SU118", "Moscow", boeing);

        Passenger p1 = new Passenger("Mihail Litvin", "LE134837");
        Passenger p2 = new Passenger("Subo Subashic", "MG517605");
        Passenger p3 = new Passenger("Askhab Tamaev", "CR780493");
        Passenger p4 = new Passenger("Ihor Krivorychko", "TW222395");

        flight1.addPassenger(p1);
        flight1.addPassenger(p2);
        flight1.addPassenger(p3);
        flight1.addPassenger(p4);

        Terminal terminalA = new Terminal("A", 3);
        terminalA.addFlight(flight1);
        terminalA.displayAllFlights();
        flight1.displayPassengers();
        }
    }
