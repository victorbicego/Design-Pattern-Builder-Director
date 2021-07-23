package com.victorbicego.designpattern;

public class CarDirector {

    public static Car makeEconomyCar() {
        Car c = new CarBuilder()
                .setModel(CarModel.POLO)
                .setEngineAndAutomaker()
                .setSeats(5)
                .setDoors(4)
                .build();

        return c;
    }

    public static Car makeLuxuryCar() {
        Car c = new CarBuilder()
                .setModel(CarModel.CLS)
                .setEngineAndAutomaker()
                .setSeats(5)
                .setDoors(4)
                .setAirConditioning()
                .setGPS()
                .build();

        return c;
    }

    public static Car makeSportCar() {
        Car c = new CarBuilder()
                .setModel(CarModel.SUPERFAST)
                .setEngineAndAutomaker()
                .setSeats(2)
                .setDoors(2)
                .setAirConditioning()
                .setGPS()
                .setAirfoils()
                .build();

        return c;
    }

    public static Car makeOffroadCar() {
        Car c = new CarBuilder()
                .setModel(CarModel.GLADIATOR)
                .setEngineAndAutomaker()
                .setSeats(5)
                .setDoors(4)
                .setAirConditioning()
                .setGPS()
                .setFourWheelDrive()
                .build();

        return c;
    }
}
