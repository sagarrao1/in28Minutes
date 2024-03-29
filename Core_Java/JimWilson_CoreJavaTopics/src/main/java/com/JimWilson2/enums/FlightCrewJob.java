package com.JimWilson2.enums;

public enum FlightCrewJob {
    FLIGHT_ATTENDANT("Flight Attendant"),
    COPILOT("First Officer"),
    PILOT("Captain");

    private String title;
    public String getTitle() { return title; }
    
    private FlightCrewJob(String title) {
        this.title = title;
    }
}
