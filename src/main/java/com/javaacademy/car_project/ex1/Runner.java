package com.javaacademy.car_project.ex1;

import java.math.BigDecimal;

public class Runner {
    public static void main(String[] args) {
        Car car = new Car("audi", 180, BigDecimal.TEN);
        Car emptyCar = new Car();
        System.out.println(car);

        Truck truck = new Truck("Bmw", 100);
        System.out.println(truck);


    }
}
