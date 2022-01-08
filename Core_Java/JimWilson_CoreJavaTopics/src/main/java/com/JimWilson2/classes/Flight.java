package com.JimWilson2.classes;

public class Flight {
    private int passengers;
    private int seats;
    
	public Flight() {
		this.passengers = 0;
		this.seats = 150;
	}

	public int getPassengers() {
		return passengers;
	}

	
	public void setPassengers(int passengers) {
		this.passengers = passengers;
	}

	public void addPassenger() {
		if ( seats >= passengers) {
			passengers += 1;
		} else {
			handleTooMany();
		}
	}

	private void handleTooMany() {
		System.out.println("Seats are full. can't add passanger");
		
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}
	
	public boolean hasRoom(Flight f2) {
		if ((this.passengers + f2.passengers) > this.seats)
			return false;
		else		
		return true;
	}
	
	public Flight createNewWithBoth(Flight f2) {
		Flight newFlight=  new Flight();
		newFlight.seats=seats;
		newFlight.passengers = passengers + f2.passengers;		
		return newFlight;
	}




}
