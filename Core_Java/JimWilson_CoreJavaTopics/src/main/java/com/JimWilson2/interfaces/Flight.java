package com.JimWilson2.interfaces;

import java.util.ArrayList;
import java.util.Iterator;


public class Flight
		implements Comparable<Flight> , Iterable<Passanger> {
    private int passengers;
    private int seats = 150;
    private ArrayList<Passanger> passengerList = new ArrayList<>();

    // flightTime is tracked as minutes past midnight
    // i.e. 12:15am - > 15 (15 min after midnight), 1:30 am - > 90 (90 min after midnight), etc.
    private int flightTime ;

    private int totalCheckedBags;

    private int flightNumber;
    private char flightClass;

    public Flight() { }

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Flight(char flightClass) {
        this.flightClass = flightClass;
    }

    public void add1Passenger(Passanger p) {
    	passengerList.add(p);    	
        if(hasSeating())
            passengers += 1;
    }

    private boolean hasSeating() {
             return passengers < seats;
    }

    private boolean hasSeating(int count) {
        return passengers + count <= seats;
    }

    public int getPassengers() {
        return passengers;
    }

    public void setPassengers(int passengers) {
        this.passengers = passengers;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(int flightTime) {
        this.flightTime = flightTime;
    }

    public int getTotalCheckedBags() {
        return totalCheckedBags;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("executing Flight.equals(Object o)");

        if(super.equals(o)) {
            System.out.println("Both references point to the same Flight instance)");
            return true;
        }
        if (!(o instanceof Flight)) {
            System.out.println("Object being compared is NOT a Flight");
            return false;
        }
        Flight flight = (Flight) o;

        return flightNumber == flight.flightNumber &&
                flightClass == flight.flightClass;
    }

    @Override
    public int compareTo(Flight flight) {
        // Flights are sorted by time of day. Ordering starts with those just after midnight and
        // continuing through the rest of the day. (i.e. 15 (12:15am) comes before 90 (1:30am)
        return flightTime - flight.flightTime;
    }

	public ArrayList<Passanger> getPassengerList() {
		return passengerList;
	}

    @Override
    public Iterator<Passanger> iterator() {
        return passengerList.iterator();
    }
    
    
}
