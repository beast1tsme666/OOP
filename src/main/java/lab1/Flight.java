package lab1;

public class Flight {
    private String FlightNumber;
    private String destination;
    private Airplane airplane;
    private Passenger[] passengers;
    private int PassengersCount;

    public Flight(String FlightNumber, String destination, Airplane airplane) {
        this.FlightNumber = FlightNumber;
        this.destination = destination;
        this.airplane = airplane;
        this.passengers = new Passenger[airplane.getCapacity()];
        this.PassengersCount = 0;
    }
    public String getFlightNumber() {
        return FlightNumber;
    }

    public String getDestination() {
        return destination;
    }

    public void addPassenger(Passenger passenger){
        if (PassengersCount < passengers.length) {
            passengers[PassengersCount] = passenger;
            PassengersCount++;
            System.out.println("Пассажир " + passenger.getName() + " добавлен на рейс " + FlightNumber);
        } else {
            System.out.println("Рейс " + FlightNumber + " полностью заполнен");
        }
    }

    public void displayPassengers() {
        System.out.println("Пассажиры рейса " + FlightNumber + ":");
        for (int i = 0; i < PassengersCount; i++) {
            System.out.println("- " + passengers[i].getName() + " (" + passengers[i].getPassportNumber() + ")");
        }
    }
}

