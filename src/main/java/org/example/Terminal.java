package org.example;

public class Terminal {
    private String name;
    private Flight[] flights;
    private int flightCount;

    public Terminal(String name, int maxFlights){
        this.name = name;
        this.flights = new Flight[maxFlights];
        this.flightCount = 0;
    }

    public void addFlight(Flight flight) {
        if (flightCount < flights.length) {
            flights[flightCount] = flight;
            flightCount++;
            System.out.println("Рейс " + flight.getFlightNumber() + " добавлен в терминал " + name);
        } else {
            System.out.println("Терминал " + name + " переполнен, невозможно добавить рейс.");
        }
    }

    public void displayAllFlights() {
        System.out.println("Рейсы в терминале " + name + ":");
        for(int i = 0; i < flightCount; i++){
            System.out.println("- " + flights[i].getFlightNumber() + " -> " + flights[i].getDestination());
        }
    }

    public Flight findFlight(String FlightNumber) {
        for (int i = 0; i < flightCount; i++){
            if (flights[i].getFlightNumber().equals(FlightNumber)){
                return flights[i];
            }
        }
        return null;
    }
}

