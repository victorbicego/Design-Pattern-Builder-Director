package com.victorbicego.designpattern;

public class Client {
    public static void main(String[] args) {

        Car c1 = CarDirector.makeEconomyCar();
        System.out.println(c1);

        Car c2 = CarDirector.makeLuxuryCar();
        System.out.println(c2);

        Car c3 = CarDirector.makeSportCar();
        System.out.println(c3);

        Car c4 = CarDirector.makeOffroadCar();
        System.out.println(c4);

    }
}
