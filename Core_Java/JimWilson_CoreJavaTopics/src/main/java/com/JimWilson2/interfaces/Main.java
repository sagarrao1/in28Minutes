package com.JimWilson2.interfaces;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		comparable();
		flightWithIterator();
		
	}

	private static void comparable() {
		Passanger[] passangers = {
				new Passanger("Sagar", 1, 180),
				new Passanger("raji", 1, 90),
				new Passanger("Suju", 2, 4),
				new Passanger("Thirupathi", 3, 18)				
		};
		
//		Arrays sort will sort based on comparable. 
//		interface for Passanger 
		
		Arrays.sort(passangers);
		
		for (Passanger passanger : passangers) {
			System.out.println(passanger);
		}
	}
	
    private static void flightWithIterator() {
        System.out.println("***************************");
        System.out.println("For-each through Flight Passenger list with Iterable");
        System.out.println();

        Flight f175 = new Flight(175);
        f175.add1Passenger(new Passanger("Sagar", 1, 180));
        f175.add1Passenger(new Passanger("raji", 1, 90));
        f175.add1Passenger(new Passanger("Suju", 2, 4));
        f175.add1Passenger(new Passanger("Thirupathi", 3, 18));
        
        f175.getPassengerList().sort(null);
        		
//        this is happening as we are Itarable interface in Flight class
//        1st way
        for (Passanger p : f175) {
            System.out.println("Passenger name: " + p.getName());
        }

//        2nd way using getter of passengerList
//        ArrayList<Passanger> passengerList = f175.getPassengerList();
//        for (Passanger passanger : passengerList) {
//        	System.out.println("Passenger name: " + passanger.getName());
//		}
        System.out.println("***************************");
        System.out.println();
    }
	

}
