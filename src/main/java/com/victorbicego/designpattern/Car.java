package com.victorbicego.designpattern;

public class Car {
    private Enum<CarModel> model;
    private String engine;
    private String automaker;
    private int seats;
    private int doors;
    private boolean hasAirConditioning;
    private boolean hasGPS;
    private boolean hasAirfoils;
    private boolean hasFourWheelDrive;

    public Car(CarBuilder carBuilder) {
        this.model = carBuilder.model;
        this.engine = carBuilder.engine;
        this.automaker = carBuilder.automaker;
        this.seats = carBuilder.seats;
        this.doors = carBuilder.doors;
        this.hasAirConditioning = carBuilder.hasAirConditioning;
        this.hasGPS = carBuilder.hasGPS;
        this.hasAirfoils = carBuilder.hasAirfoils;
        this.hasFourWheelDrive = carBuilder.hasFourWheelDrive;
    }

    @Override
    public String toString() {
        String carDescription = String.format("Model: %s\nEngine: %s\nAutomaker: %s\nSeats: %d\nDoors: %d\n", model, engine, automaker, seats, doors);

        if (hasAirConditioning) {
            carDescription += "Air Conditioning: included\n";
        } else {
            carDescription += "Air Conditioning: not included\n";
        }

        if (hasGPS) {
            carDescription += "GPS: included\n";
        } else {
            carDescription += "GPS: not included\n";
        }

        if (hasAirfoils) {
            carDescription += "Airfoil: included\n";
        } else {
            carDescription += "Airfoil: not included\n";
        }

        if (hasFourWheelDrive) {
            carDescription += "Four Wheel Drive: included\n";
        } else {
            carDescription += "Four Wheel Drive: not included\n";
        }


        return carDescription;
    }
}
