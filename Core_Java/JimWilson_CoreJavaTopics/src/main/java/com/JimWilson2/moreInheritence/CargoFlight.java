package com.JimWilson2.moreInheritence;

public class CargoFlight extends Flight {
    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;
    int seats = 12;

    public CargoFlight(int flightNumber) {
        super(flightNumber);
        System.out.println("executing CargoFlight(int flightNumber) constructor");
    }

    public CargoFlight(int flightNumber, float maxCargoSpace) {
//        super(flightNumber);
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
        System.out.println("executing CargoFlight(int flightNumber, float maxCargoSpace) constructor");
    }

    public CargoFlight() {
        System.out.println("executing CargoFlight() constructor");
    }

    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
        System.out.println("executing CargoFlight(float maxCargoSpace) constructor");

    }

    public void add1Package(float h, float w, float d) {
        float size = h * w * d;
        if (hasCargoSpace(size))
          usedCargoSpace += size;
        else
            handleNoSpace();
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space");
    }
}
