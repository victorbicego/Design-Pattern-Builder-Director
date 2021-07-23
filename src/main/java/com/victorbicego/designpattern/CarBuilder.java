package com.victorbicego.designpattern;

public class CarBuilder {
    public Enum<CarModel> model;
    public String engine;
    public String automaker;
    public int seats;
    public int doors;
    public boolean hasAirConditioning;
    public boolean hasGPS;
    public boolean hasAirfoils;
    public boolean hasFourWheelDrive;

    public CarBuilder setModel(Enum<CarModel> model) {
        this.model = model;
        return this;
    }

    public CarBuilder setEngineAndAutomaker() {

        if (this.model.name().equals("POLO")) {
            this.engine = "1.0 3-cylinders";
            this.automaker = "Volkswagen";
        }
        if (this.model.name().equals("CLS")) {
            this.engine = "2.0 4-cylinders";
            this.automaker = "Mercedes";
        }
        if (this.model.name().equals("SUPERFAST")) {
            this.engine = "6.5 V12";
            this.automaker = "Ferrari";
        }
        if (this.model.name().equals("GLADIATOR")) {
            this.engine = "3.6 V6";
            this.automaker = "Jeep";
        }

        return this;
    }

    public CarBuilder setSeats(int seats) {
        this.seats = seats;
        return this;
    }

    public CarBuilder setDoors(int doors) {
        this.doors = doors;
        return this;
    }

    public CarBuilder setAirConditioning() {
        this.hasAirConditioning = true;
        return this;
    }

    public CarBuilder setGPS() {
        this.hasGPS = true;
        return this;
    }

    public CarBuilder setAirfoils() {
        this.hasAirfoils = true;
        return this;
    }

    public CarBuilder setFourWheelDrive() {
        this.hasFourWheelDrive = true;
        return this;
    }

    public Car build() {
        return new Car(this);
    }

}
